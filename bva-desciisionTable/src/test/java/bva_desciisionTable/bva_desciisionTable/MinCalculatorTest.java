package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {
    
	 @Test
	    void  epA_less_than_1() {
	        // arrange
	        int a = 0;   // ערך לא חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	@Test
	void  epA_more_than_1000() {
		// arrange
		int a = 1001;   // ערך לא חוקי
		int b = 16;
		int c = 400;
		int d = 400;
		int e = 400;

		// act + assert
		assertThrows(IllegalArgumentException.class, () -> {
			MinCalculator.findMin(a, b, c, d, e);
		});
	}

	@Test
	void  epB_more_than_1000() {
		// arrange
		int a = 20;   // ערך לא חוקי
		int b = 1001;
		int c = 400;
		int d = 400;
		int e = 400;

		// act + assert
		assertThrows(IllegalArgumentException.class, () -> {
			MinCalculator.findMin(a, b, c, d, e);
		});
	}

	@Test
	void  epB_less_than_1() {
		// arrange
		int a = 50;   // ערך לא חוקי
		int b = 0;
		int c = 50;
		int d = 50;
		int e = 50;

		// act + assert
		assertThrows(IllegalArgumentException.class, () -> {
			MinCalculator.findMin(a, b, c, d, e);
		});
	}


	@Test
	    void epA_1to_1000_min() {
	        // arrange
	        int a = 1;    // ערך גבול תקין
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(1, result);   // 1 הוא הערך המינימלי
	    }


	@Test
	void epA_1to_1000_nominal() {
		// arrange
		int a = 25;    // ערך גבול תקין
		int b = 50;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(25, result);   // 1 הוא הערך המינימלי
	}


	@Test
	void epA_1to_1000_max() {
		// arrange
		int a = 1000;    // ערך גבול תקין
		int b = 20;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(20, result);   // 1 הוא הערך המינימלי
	}


	@Test
	void epA_1to_1000_max_less1() {
		// arrange
		int a = 999;    // ערך גבול תקין
		int b = 20;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(20, result);   // 1 הוא הערך המינימלי
	}

	@Test
	void epA_1to_1000_min_more1() {
		// arrange
		int a = 2;    // ערך גבול תקין
		int b = 20;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(2, result);   // 1 הוא הערך המינימלי
	}

	@Test
	void epB_1to_1000_min() {
		// arrange
		int a = 50;    // ערך גבול תקין
		int b = 1;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(1, result);   // 1 הוא הערך המינימלי
	}

	@Test
	void epB_1to_1000_nominal() {
		// arrange
		int a = 50;    // ערך גבול תקין
		int b = 20;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(20, result);   // 1 הוא הערך המינימלי
	}

	@Test
	void epB_1to_1000_max() {
		// arrange
		int a = 20;
		int b = 1000;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(20, result);
	}

	@Test
	void epB_1to_1000_max_less1() {
		// arrange
		int a = 999;    // ערך גבול תקין
		int b = 20;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(20, result);   // 1 הוא הערך המינימלי
	}

	@Test
	void epB_1to_1000_min_more1() {
		// arrange
		int a = 50;    // ערך גבול תקין
		int b = 2;
		int c = 50;
		int d = 50;
		int e = 50;

		// act
		int result = MinCalculator.findMin(a, b, c, d, e);

		// assert
		assertEquals(2, result);   // 1 הוא הערך המינימלי
	}




}
