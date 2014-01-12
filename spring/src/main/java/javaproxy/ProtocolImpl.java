package javaproxy;

public class ProtocolImpl implements Protocol, Vacuous {

	public void dosomething() {
		System.out.println("impl");
	}

	public void something() {
		System.out.println("something");
	}

	public void vacuous() {
		System.out.println("vacuous");
	}

}
