package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int[] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));	
	
	}
	@Test
	public void hasDuplicates_test2() 
	{
		
		int[] arr = {1,1,2,3,4};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));

	}
	
	@Test
	public void hasDuplicates_test3() {
		
		int[] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}
	
	
	@Test
	public void hasDuplicates_test4() {
		
		int[] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	
	}
	
	@Test
	public void doesElementExist_test1() {
		
		int[] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void doesElementExist_test2() {
		
		int[] arr = {1,2,3,4,5};
		int iValue = 6;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void doesElementExist_test3() {
		
		int[] arr = null;
		int iValue = 1;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void ContainsZero_test1() {
		
		int[][] mySquare = {{1,2,3},{3,2,1},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertFalse(ls.ContainsZero());
	}
	@Test
	public void ContainsZero_test2() {
		
		int[][] mySquare = {{1,0,2},{1,2,3},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertTrue(ls.ContainsZero());
	}

	@Test
	public void getColumn_test1() {
		
		int[][] mySquare = {{1,2,3},{4,5,6},{7,8,9}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getColumn(1)));
		
  }
	@Test
	public void getColumn_test2() {
		
		int[][] mySquare = {{1,2,3},{4,5,6},{7,8,9}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getColumn(2)));
	}
	@Test
	public void getRow_test1() {
		
		int[][] mySquare = {{1,2,3},{4,5,6},{7,8,9}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(0)));
	}
	@Test
	public void getRow_test2() {
		
		int[][] mySquare = {{1,2,3},{4,5,6},{7,8,9}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		System.out.println(Arrays.toString(ls.getRow(2)));
	}
	
	@Test
	public void hasAllValues_test1() {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));
		
	}
	@Test
	public void hasAllValues_test2() {
		
		int[] arr1 = null;
		int[] arr2 = null;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void hasAllValues_test3() {
		
		int[] arr1 = {4,5,6};
		int[] arr2 = {5,6,4};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));
	}
	
	@Test
	public void hasAllValues_test4() {
		
		int[] arr1 = {10,12,13};
		int[] arr2 = {12,13,10};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void hasAllValues_test5() {
		
		int[] arr1 = {5,7,8};
		int[] arr2 = {10,7,8};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void hasAllValues_test6() {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = null;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void isLatinSquare_test1() {
		
		int[][] mySquare = {{1,2,3},{4,5,6},{7,8,9}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		
		assertFalse(ls.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test2() {
		
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		
		assertTrue(ls.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test3() {
		
		int[][] mySquare = {{0,2,3},{3,1,2},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		
		assertFalse(ls.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test4() {
		
		int[][] mySquare = {{1,2,2},{3,1,2},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		
		assertFalse(ls.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test5() {
		
		int[][] mySquare = {{2,3,4},{4,2,3},{3,4,2}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		
		assertTrue(ls.isLatinSquare());
	}
	
}
