package com.qa.bae.blackjack;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.blackjack.BlackJack;

public class UnitTestsPlay {
	static BlackJack blackjack;

	@BeforeClass
	public static void setup() {
		blackjack = new BlackJack();
	}

	@Test
	public void test1() {
		assertEquals(10, blackjack.play(25, 10));
	}

	@Test
	public void test2() {
		assertEquals(10, blackjack.play(10, 25));
	}

	@Test
	public void test3() {
		assertEquals(0, blackjack.play(25, 25));
	}

	@Test
	public void test4() {
		assertEquals(21, blackjack.play(10, 21));
	}

	@Test
	public void test5() {
		assertEquals(21, blackjack.play(21, 10));
	}

	@Test
	public void test6() {
		assertEquals(-1, blackjack.play(31, 31));
	}

	@Test
	public void test7() {
		assertEquals(-1, blackjack.play(1, 1));
	}

	@Test
	public void test8() {
		assertEquals(-1, blackjack.play(10, 32));
	}

	@Test
	public void test9() {
		assertEquals(-1, blackjack.play(10, 1));
	}

	@Test
	public void test10() {
		assertEquals(-1, blackjack.play(31, 10));
	}

	@Test
	public void test11() {
		assertEquals(10, blackjack.play(30, 10));
	}

	@Test
	public void test12() {
		assertEquals(-1, blackjack.play(1, 10));
	}

	@Test
	public void test13() {
		assertEquals(10, blackjack.play(3, 10));
	}

}
