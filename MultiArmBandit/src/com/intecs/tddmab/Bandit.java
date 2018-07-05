package com.intecs.tddmab;

public class Bandit {
	
	private BernulliDistribution ber;
	
	public Bandit() {
		this(new WinProbability(1d));
	}

	public Bandit(WinProbability p) {
		if(p==null) throw new NullPointerException("Bandit con argomento NULL");
		ber = new BernulliDistribution(p);
	}

	public Reward pull() {
		return ber.getSample();
	}

}
