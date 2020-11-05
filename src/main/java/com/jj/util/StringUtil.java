package com.jj.util;

public class StringUtil {

        public String convertFirstCharacterToCapital(final String value){

                return value.substring(0, 1).toLowerCase() + value.substring(1);
        }
}
