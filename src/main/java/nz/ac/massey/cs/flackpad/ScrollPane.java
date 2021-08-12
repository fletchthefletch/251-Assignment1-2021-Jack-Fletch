package nz.ac.massey.cs.flackpad;

import javax.swing.BorderFactory;
import javax.swing.ScrollPaneConstants;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

@SuppressWarnings("serial")
public class ScrollPane extends RTextScrollPane {
	
	ScrollPane(RSyntaxTextArea textArea) {
		// Call RTextScrollPane constructor with textArea as the contained text area
		super(textArea);
		
		// Add border
		getGutter().setBorder(BorderFactory.createCompoundBorder(getBorder(), BorderFactory.createEmptyBorder(3, 5, 0, 5)));
		
		setBorder(null);
		setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	}

	void setTheme(Config config) {
		// Set font
		getGutter().setLineNumberFont(config.getFont());
		
		// Set colours
		getGutter().setBackground(MainTheme.gutterBackground);
		getGutter().setBorderColor(MainTheme.gutterBorder);		
		getGutter().setLineNumberColor(MainTheme.gutterLineNumber);
	}

}
