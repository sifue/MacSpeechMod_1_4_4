import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacSpeechFilter {
	public String full(String paramString) {
		paramString = onlyMessage(paramString);
		paramString = color(paramString);
		paramString = space(paramString);
		return paramString;
	}

	private static final Pattern MEMBER_MESSAGE = Pattern.compile("(<[A-Za-z0-9_]+> )(.*)");

	private String onlyMessage(String paramString) {
		if (paramString == null || paramString.isEmpty())
			return "";
		Matcher matcher = MEMBER_MESSAGE.matcher(paramString);
		if (!matcher.matches())
			return "";
		return matcher.group(2);
	}

	private String color(String paramString) {
		return paramString.replaceAll("§.", "");
	}

	private String space(String paramString) {
		return paramString.replaceAll(" {2,}", "  ");
	}

}