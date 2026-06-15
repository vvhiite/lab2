import java.util.ArrayList;

/**
 * Stores data shared between the worker threads. It keeps the input array, the
 * target value, the found solution flags, and the final result flag used by the
 * threads.
 *
 * @author classroom
 */
public class SharedData {
	private ArrayList<Integer> array;
	private boolean[] winArray;
	private boolean flag;
	private final int b;

	/**
	 * Creates a shared data object with the given array and target value.
	 *
	 * @param array the input numbers
	 * @param b     the target value to reach
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns the result array that marks which elements are part of the solution.
	 *
	 * @return the solution marker array
	 */
	public boolean[] getWinArray() {
		return winArray;
	}

	/**
	 * Sets the result array that marks which elements are part of the solution.
	 *
	 * @param winArray the solution marker array
	 */
	public void setWinArray(boolean[] winArray) {
		this.winArray = winArray;
	}

	/**
	 * Returns the input array.
	 *
	 * @return the input array
	 */
	public ArrayList<Integer> getArray() {
		return array;
	}

	/**
	 * Returns the target value.
	 *
	 * @return the target value b
	 */
	public int getB() {
		return b;
	}

	/**
	 * Returns whether a solution was found.
	 *
	 * @return true if a solution was found, otherwise false
	 */
	public boolean getFlag() {
		return flag;
	}

	/**
	 * Sets whether a solution was found.
	 *
	 * @param flag true if a solution was found, otherwise false
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}