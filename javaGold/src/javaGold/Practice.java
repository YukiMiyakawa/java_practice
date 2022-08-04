package javaGold;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Practice {
	String name;
	String address;

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
}
