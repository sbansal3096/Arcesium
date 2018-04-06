package spring;

import org.springframework.stereotype.Component;

@Component
public class Reverse {
	String reverse(String s) {
		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		s1 = s1.reverse();
        return s1.toString();
	}
}
