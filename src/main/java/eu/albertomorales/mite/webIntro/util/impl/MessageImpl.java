package eu.albertomorales.mite.webIntro.util.impl;

import eu.albertomorales.mite.webIntro.util.Message;

public class MessageImpl implements Message {

	/* (non-Javadoc)
	 * @see eu.albertomorales.webIntro.impl.Messagee#getText()
	 */
	@Override
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private String text;

}
