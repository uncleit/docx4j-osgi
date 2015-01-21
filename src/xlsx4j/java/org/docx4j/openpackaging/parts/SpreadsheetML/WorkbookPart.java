package org.docx4j.openpackaging.parts.SpreadsheetML;

import java.util.List;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.parts.Part;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.relationships.Namespaces;
import org.xlsx4j.exceptions.Xlsx4jException;
import org.xlsx4j.sml.Sheet;
import org.xlsx4j.sml.Workbook;

public class WorkbookPart  extends JaxbSmlPart<Workbook> {
	
	protected SharedStrings sharedStrings;
	
	public WorkbookPart(PartName partName) throws InvalidFormatException {
		super(partName);
		init();
	}

	public WorkbookPart() throws InvalidFormatException {
		super(new PartName("/xl/workbook.xml"));
		init();
	}
	
	public void init() {	
				
		// Used if this Part is added to [Content_Types].xml 
		setContentType(new  org.docx4j.openpackaging.contenttype.ContentType( 
				org.docx4j.openpackaging.contenttype.ContentTypes.SPREADSHEETML_WORKBOOK));

		// Used when this Part is added to a rels 
		setRelationshipType(Namespaces.SPREADSHEETML_WORKBOOK);
		
	}
	
	public SharedStrings getSharedStrings() {
		return sharedStrings;
	}
	
	
	public boolean setPartShortcut(Part part) {
		
		if (part == null ){
			return false;
		} else {
			return setPartShortcut(part, part.getRelationshipType() );
		}
		
	}	
		
	public boolean setPartShortcut(Part part, String relationshipType) {
		
		// Since each part knows its relationshipsType,
		// why is this passed in as an arg?
		// Answer: where the relationshipType is ascertained
		// from the rel itself, it is the most authoritative.
		// Note that we normally use the info in [Content_Types]
		// to create a part of the correct type.  This info
		// will not necessary correspond to the info in the rel!
		
		if (relationshipType==null) {
			log.warn("trying to set part shortcut against a null relationship type.");
			return false;
		}
		
		if (relationshipType.equals(Namespaces.SPREADSHEETML_SHARED_STRINGS)) {
			sharedStrings = (SharedStrings)part;
			return true;			
		} else {	
			return false;
		}
	}
	
	/**
	 * @param index
	 * @return
	 * @throws Xlsx4jException
	 * @ since 3.0.1
	 */
	public WorksheetPart getWorksheet(int index) throws Xlsx4jException {
		
		List<Sheet> sheets;
		try {
			sheets = this.getContents().getSheets().getSheet();
		} catch (Docx4JException e1) {
			throw new Xlsx4jException(e1.getMessage(), e1);
		} 

		int zeroBasedCount = sheets.size() -1; 

		if (index< 0 || index>zeroBasedCount) {
			throw new Xlsx4jException("No sheet at index " + index + ".  (There are " + sheets.size() + " sheets) ");			
		}

		try {
			Sheet s = sheets.get(index);
			return (WorksheetPart)this.getRelationshipsPart().getPart(s.getId());
		} catch (Exception e) {
			throw new Xlsx4jException("Sheet " + index + " not found", e);
		}
		
	}

}