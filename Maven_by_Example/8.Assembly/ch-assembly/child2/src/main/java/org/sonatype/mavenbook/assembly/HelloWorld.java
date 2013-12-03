package org.sonatype.mavenbook.assembly;

import com.sun.xml.ws.util.StringUtils;

/**
 * @author SESA279302
 * @since 3/12/13
 */
public class HelloWorld {

    public static void main(String[] args) {

        final String result = StringUtils.capitalize("Hello world from child 2");
        System.out.println(result);
    }
}
