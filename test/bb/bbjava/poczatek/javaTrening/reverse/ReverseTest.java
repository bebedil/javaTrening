package bb.bbjava.poczatek.javaTrening.reverse;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ReverseTest {
    @Test
    public void testReverse() {
        assertThat(Reverse.reverse(""), equalTo(""));
        assertThat(Reverse.reverse("test"), equalTo("tset"));
        assertThat(Reverse.reverse("1234"), equalTo("4321"));
        assertThat(Reverse.reverse("sedes"), equalTo("sedes"));
        assertThat(Reverse.reverse("   "), equalTo("   "));
    }

    @Test
    public void testPalindrome() {
        assertThat(Reverse.isPalindrome("sedes"), equalTo(true));
        assertThat(Reverse.isPalindrome("Sedes"), equalTo(false));
        assertThat(Reverse.isPalindrome(" sedes"), equalTo(true));
        assertThat(Reverse.isPalindrome(" se des"), equalTo(true));
        assertThat(Reverse.isPalindrome(" test"), equalTo(false));
    }
}