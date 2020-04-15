package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_REGEX =  "^[ACP][0-9]{4}[GHIKLM]$";

    public ClassName(){

    }

    public boolean validateName(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
