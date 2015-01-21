/**
 * 
 */
package org.docx4j.fonts;

import java.util.concurrent.ExecutionException;

import org.docx4j.fonts.fop.fonts.Typeface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * Check whether a PhysicalFont contains glyph sought.
 * 
 * @author jharrop
 *
 */
public class GlyphCheck {
	
	protected static Logger log = LoggerFactory.getLogger(GlyphCheck.class);	
	
	private static LoadingCache<PhysicalFont, Typeface> cache = CacheBuilder.newBuilder()
		       .maximumSize(1000)
		       .build(new CacheLoader<PhysicalFont, Typeface>() {
		             public Typeface load(PhysicalFont key)  {
		            	 
		            	 return key.getTypeface();
		               }
		             });

	
	public static boolean hasChar(PhysicalFont physicalFont, char c) throws ExecutionException {
		
		boolean exists = cache.get(physicalFont).hasChar(c);
		
		if (log.isWarnEnabled() 
				&& !exists) {
			
            log.warn("Glyph " + (int) c + " (0x"
                    + Integer.toHexString(c) 
                    + ") not available in font " + physicalFont.name);
			
		}
		
		return exists;
	}


	public static boolean hasChar(String fontName, char c) throws ExecutionException {
		
		PhysicalFont pf = PhysicalFonts.get(fontName);
		if (pf==null) {
			log.error("Couldn't get font " + fontName);
			return false;
		}
		
		return hasChar(pf, c);
	}
	
}
