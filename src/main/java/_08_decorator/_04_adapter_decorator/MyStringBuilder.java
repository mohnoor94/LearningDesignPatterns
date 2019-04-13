package _08_decorator._04_adapter_decorator;

import java.text.Collator;
import java.util.stream.IntStream;

public class MyStringBuilder {
    private StringBuilder stringBuilder;

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public MyStringBuilder(String string) {
        stringBuilder = new StringBuilder(string);
    }

    // Adapter

    public MyStringBuilder concat(String string) {
        return new MyStringBuilder(stringBuilder.toString().concat(string));
    }

    public MyStringBuilder appendLine(String string) {
        stringBuilder.append(string).append(System.lineSeparator());
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    // Decorator
    // Delegate StringBuilder methods and update the fluent-interface (returning this object to point to
    // MyStringBuilder instead of StringBuilder) // I will update a small subset of (append) the methods - not all


    /**
     * Compares two {@code StringBuilder} instances lexicographically. This method
     * follows the same rules for lexicographical comparison as defined in the
     * {@linkplain CharSequence#compare(CharSequence,
     * CharSequence)  CharSequence.compare(this, another)} method.
     *
     * <p>
     * For finer-grained, locale-sensitive String comparison, refer to
     * {@link Collator}.
     *
     * @param another the {@code StringBuilder} to be compared with
     * @return the value {@code 0} if this {@code StringBuilder} contains the same
     * character sequence as that of the argument {@code StringBuilder}; a negative integer
     * if this {@code StringBuilder} is lexicographically less than the
     * {@code StringBuilder} argument; or a positive integer if this {@code StringBuilder}
     * is lexicographically greater than the {@code StringBuilder} argument.
     * @since 11
     */
    public int compareTo(StringBuilder another) {
        return stringBuilder.compareTo(another);
    }

    public StringBuilder append(Object obj) {
        return stringBuilder.append(obj);
    }


    public MyStringBuilder append(String str) {
        stringBuilder.append(str);
        return this;
    }

    /**
     * Appends the specified {@code StringBuffer} to this sequence.
     * <p>
     * The characters of the {@code StringBuffer} argument are appended,
     * in order, to this sequence, increasing the
     * length of this sequence by the length of the argument.
     * If {@code sb} is {@code null}, then the four characters
     * {@code "null"} are appended to this sequence.
     * <p>
     * Let <i>n</i> be the length of this character sequence just prior to
     * execution of the {@code append} method. Then the character at index
     * <i>k</i> in the new character sequence is equal to the character at
     * index <i>k</i> in the old character sequence, if <i>k</i> is less than
     * <i>n</i>; otherwise, it is equal to the character at index <i>k-n</i>
     * in the argument {@code sb}.
     *
     * @param sb the {@code StringBuffer} to append.
     * @return a reference to this object.
     */
    public StringBuilder append(StringBuffer sb) {
        return stringBuilder.append(sb);
    }

    public StringBuilder append(CharSequence s) {
        return stringBuilder.append(s);
    }

    /**
     * @param s
     * @param start
     * @param end
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public MyStringBuilder append(CharSequence s, int start, int end) {
        stringBuilder.append(s, start, end);
        return this;
    }

    public MyStringBuilder append(char[] str) {
        stringBuilder.append(str);
        return this;
    }

    /**
     * @param str
     * @param offset
     * @param len
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder append(char[] str, int offset, int len) {
        return stringBuilder.append(str, offset, len);
    }

    public StringBuilder append(boolean b) {
        return stringBuilder.append(b);
    }


    public StringBuilder append(char c) {
        return stringBuilder.append(c);
    }


    public StringBuilder append(int i) {
        return stringBuilder.append(i);
    }

    public StringBuilder append(long lng) {
        return stringBuilder.append(lng);
    }

    public StringBuilder append(float f) {
        return stringBuilder.append(f);
    }

    public StringBuilder append(double d) {
        return stringBuilder.append(d);
    }

    /**
     * @param codePoint
     * @since 1.5
     */
    public StringBuilder appendCodePoint(int codePoint) {
        return stringBuilder.appendCodePoint(codePoint);
    }

    /**
     * @param start
     * @param end
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder delete(int start, int end) {
        return stringBuilder.delete(start, end);
    }

    /**
     * @param index
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder deleteCharAt(int index) {
        return stringBuilder.deleteCharAt(index);
    }

    /**
     * @param start
     * @param end
     * @param str
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder replace(int start, int end, String str) {
        return stringBuilder.replace(start, end, str);
    }

    /**
     * @param index
     * @param str
     * @param offset
     * @param len
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int index, char[] str, int offset, int len) {
        return stringBuilder.insert(index, str, offset, len);
    }

    /**
     * @param offset
     * @param obj
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, Object obj) {
        return stringBuilder.insert(offset, obj);
    }

    /**
     * @param offset
     * @param str
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, String str) {
        return stringBuilder.insert(offset, str);
    }

    /**
     * @param offset
     * @param str
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, char[] str) {
        return stringBuilder.insert(offset, str);
    }

    /**
     * @param dstOffset
     * @param s
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int dstOffset, CharSequence s) {
        return stringBuilder.insert(dstOffset, s);
    }

    /**
     * @param dstOffset
     * @param s
     * @param start
     * @param end
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
        return stringBuilder.insert(dstOffset, s, start, end);
    }

    /**
     * @param offset
     * @param b
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, boolean b) {
        return stringBuilder.insert(offset, b);
    }

    /**
     * @param offset
     * @param c
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, char c) {
        return stringBuilder.insert(offset, c);
    }

    /**
     * @param offset
     * @param i
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, int i) {
        return stringBuilder.insert(offset, i);
    }

    /**
     * @param offset
     * @param l
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, long l) {
        return stringBuilder.insert(offset, l);
    }

    /**
     * @param offset
     * @param f
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, float f) {
        return stringBuilder.insert(offset, f);
    }

    /**
     * @param offset
     * @param d
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public StringBuilder insert(int offset, double d) {
        return stringBuilder.insert(offset, d);
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return stringBuilder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public StringBuilder reverse() {
        return stringBuilder.reverse();
    }

    /**
     * Returns the length (character count).
     *
     * @return the length of the sequence of characters currently
     * represented by this object
     */
    public int length() {
        return stringBuilder.length();
    }

    /**
     * Returns the current capacity. The capacity is the amount of storage
     * available for newly inserted characters, beyond which an allocation
     * will occur.
     *
     * @return the current capacity
     */
    public int capacity() {
        return stringBuilder.capacity();
    }

    /**
     * Ensures that the capacity is at least equal to the specified minimum.
     * If the current capacity is less than the argument, then a new internal
     * array is allocated with greater capacity. The new capacity is the
     * larger of:
     * <ul>
     * <li>The {@code minimumCapacity} argument.
     * <li>Twice the old capacity, plus {@code 2}.
     * </ul>
     * If the {@code minimumCapacity} argument is nonpositive, this
     * method takes no action and simply returns.
     * Note that subsequent operations on this object can reduce the
     * actual capacity below that requested here.
     *
     * @param minimumCapacity the minimum desired capacity.
     */
    public void ensureCapacity(int minimumCapacity) {
        stringBuilder.ensureCapacity(minimumCapacity);
    }

    /**
     * Attempts to reduce storage used for the character sequence.
     * If the buffer is larger than necessary to hold its current sequence of
     * characters, then it may be resized to become more space efficient.
     * Calling this method may, but is not required to, affect the value
     * returned by a subsequent call to the {@link #capacity()} method.
     */
    public void trimToSize() {
        stringBuilder.trimToSize();
    }

    /**
     * Sets the length of the character sequence.
     * The sequence is changed to a new character sequence
     * whose length is specified by the argument. For every nonnegative
     * index <i>k</i> less than {@code newLength}, the character at
     * index <i>k</i> in the new character sequence is the same as the
     * character at index <i>k</i> in the old sequence if <i>k</i> is less
     * than the length of the old character sequence; otherwise, it is the
     * null character {@code '\u005Cu0000'}.
     * <p>
     * In other words, if the {@code newLength} argument is less than
     * the current length, the length is changed to the specified length.
     * <p>
     * If the {@code newLength} argument is greater than or equal
     * to the current length, sufficient null characters
     * ({@code '\u005Cu0000'}) are appended so that
     * length becomes the {@code newLength} argument.
     * <p>
     * The {@code newLength} argument must be greater than or equal
     * to {@code 0}.
     *
     * @param newLength the new length
     * @throws IndexOutOfBoundsException if the
     *                                   {@code newLength} argument is negative.
     */
    public void setLength(int newLength) {
        stringBuilder.setLength(newLength);
    }

    /**
     * Returns the {@code char} value in this sequence at the specified index.
     * The first {@code char} value is at index {@code 0}, the next at index
     * {@code 1}, and so on, as in array indexing.
     * <p>
     * The index argument must be greater than or equal to
     * {@code 0}, and less than the length of this sequence.
     *
     * <p>If the {@code char} value specified by the index is a
     * <a href="Character.html#unicode">surrogate</a>, the surrogate
     * value is returned.
     *
     * @param index the index of the desired {@code char} value.
     * @return the {@code char} value at the specified index.
     * @throws IndexOutOfBoundsException if {@code index} is
     *                                   negative or greater than or equal to {@code length()}.
     */
    public char charAt(int index) {
        return stringBuilder.charAt(index);
    }

    /**
     * Returns the character (Unicode code point) at the specified
     * index. The index refers to {@code char} values
     * (Unicode code units) and ranges from {@code 0} to
     * {@link #length()}{@code  - 1}.
     *
     * <p> If the {@code char} value specified at the given index
     * is in the high-surrogate range, the following index is less
     * than the length of this sequence, and the
     * {@code char} value at the following index is in the
     * low-surrogate range, then the supplementary code point
     * corresponding to this surrogate pair is returned. Otherwise,
     * the {@code char} value at the given index is returned.
     *
     * @param index the index to the {@code char} values
     * @return the code point value of the character at the
     * {@code index}
     * @throws IndexOutOfBoundsException if the {@code index}
     *                                   argument is negative or not less than the length of this
     *                                   sequence.
     */
    public int codePointAt(int index) {
        return stringBuilder.codePointAt(index);
    }

    /**
     * Returns the character (Unicode code point) before the specified
     * index. The index refers to {@code char} values
     * (Unicode code units) and ranges from {@code 1} to {@link
     * #length()}.
     *
     * <p> If the {@code char} value at {@code (index - 1)}
     * is in the low-surrogate range, {@code (index - 2)} is not
     * negative, and the {@code char} value at {@code (index -
     * 2)} is in the high-surrogate range, then the
     * supplementary code point value of the surrogate pair is
     * returned. If the {@code char} value at {@code index -
     * 1} is an unpaired low-surrogate or a high-surrogate, the
     * surrogate value is returned.
     *
     * @param index the index following the code point that should be returned
     * @return the Unicode code point value before the given index.
     * @throws IndexOutOfBoundsException if the {@code index}
     *                                   argument is less than 1 or greater than the length
     *                                   of this sequence.
     */
    public int codePointBefore(int index) {
        return stringBuilder.codePointBefore(index);
    }

    /**
     * Returns the number of Unicode code points in the specified text
     * range of this sequence. The text range begins at the specified
     * {@code beginIndex} and extends to the {@code char} at
     * index {@code endIndex - 1}. Thus the length (in
     * {@code char}s) of the text range is
     * {@code endIndex-beginIndex}. Unpaired surrogates within
     * this sequence count as one code point each.
     *
     * @param beginIndex the index to the first {@code char} of
     *                   the text range.
     * @param endIndex   the index after the last {@code char} of
     *                   the text range.
     * @return the number of Unicode code points in the specified text
     * range
     * @throws IndexOutOfBoundsException if the
     *                                   {@code beginIndex} is negative, or {@code endIndex}
     *                                   is larger than the length of this sequence, or
     *                                   {@code beginIndex} is larger than {@code endIndex}.
     */
    public int codePointCount(int beginIndex, int endIndex) {
        return stringBuilder.codePointCount(beginIndex, endIndex);
    }

    /**
     * Returns the index within this sequence that is offset from the
     * given {@code index} by {@code codePointOffset} code
     * points. Unpaired surrogates within the text range given by
     * {@code index} and {@code codePointOffset} count as
     * one code point each.
     *
     * @param index           the index to be offset
     * @param codePointOffset the offset in code points
     * @return the index within this sequence
     * @throws IndexOutOfBoundsException if {@code index}
     *                                   is negative or larger then the length of this sequence,
     *                                   or if {@code codePointOffset} is positive and the subsequence
     *                                   starting with {@code index} has fewer than
     *                                   {@code codePointOffset} code points,
     *                                   or if {@code codePointOffset} is negative and the subsequence
     *                                   before {@code index} has fewer than the absolute value of
     *                                   {@code codePointOffset} code points.
     */
    public int offsetByCodePoints(int index, int codePointOffset) {
        return stringBuilder.offsetByCodePoints(index, codePointOffset);
    }

    /**
     * Characters are copied from this sequence into the
     * destination character array {@code dst}. The first character to
     * be copied is at index {@code srcBegin}; the last character to
     * be copied is at index {@code srcEnd-1}. The total number of
     * characters to be copied is {@code srcEnd-srcBegin}. The
     * characters are copied into the subarray of {@code dst} starting
     * at index {@code dstBegin} and ending at index:
     * <pre>{@code
     * dstbegin + (srcEnd-srcBegin) - 1
     * }</pre>
     *
     * @param srcBegin start copying at this offset.
     * @param srcEnd   stop copying at this offset.
     * @param dst      the array to copy the data into.
     * @param dstBegin offset into {@code dst}.
     * @throws IndexOutOfBoundsException if any of the following is true:
     *                                   <ul>
     *                                   <li>{@code srcBegin} is negative
     *                                   <li>{@code dstBegin} is negative
     *                                   <li>the {@code srcBegin} argument is greater than
     *                                   the {@code srcEnd} argument.
     *                                   <li>{@code srcEnd} is greater than
     *                                   {@code this.length()}.
     *                                   <li>{@code dstBegin+srcEnd-srcBegin} is greater than
     *                                   {@code dst.length}
     *                                   </ul>
     */
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        stringBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    /**
     * The character at the specified index is set to {@code ch}. This
     * sequence is altered to represent a new character sequence that is
     * identical to the old character sequence, except that it contains the
     * character {@code ch} at position {@code index}.
     * <p>
     * The index argument must be greater than or equal to
     * {@code 0}, and less than the length of this sequence.
     *
     * @param index the index of the character to modify.
     * @param ch    the new character.
     * @throws IndexOutOfBoundsException if {@code index} is
     *                                   negative or greater than or equal to {@code length()}.
     */
    public void setCharAt(int index, char ch) {
        stringBuilder.setCharAt(index, ch);
    }

    /**
     * Returns a new {@code String} that contains a subsequence of
     * characters currently contained in this character sequence. The
     * substring begins at the specified index and extends to the end of
     * this sequence.
     *
     * @param start The beginning index, inclusive.
     * @return The new string.
     * @throws StringIndexOutOfBoundsException if {@code start} is
     *                                         less than zero, or greater than the length of this object.
     */
    public String substring(int start) {
        return stringBuilder.substring(start);
    }

    /**
     * Returns a new character sequence that is a subsequence of this sequence.
     *
     * <p> An invocation of this method of the form
     *
     * <pre>{@code
     * sb.subSequence(begin,&nbsp;end)}</pre>
     * <p>
     * behaves in exactly the same way as the invocation
     *
     * <pre>{@code
     * sb.substring(begin,&nbsp;end)}</pre>
     * <p>
     * This method is provided so that this class can
     * implement the {@link CharSequence} interface.
     *
     * @param start the start index, inclusive.
     * @param end   the end index, exclusive.
     * @return the specified subsequence.
     * @throws IndexOutOfBoundsException if {@code start} or {@code end} are negative,
     *                                   if {@code end} is greater than {@code length()},
     *                                   or if {@code start} is greater than {@code end}
     * @spec JSR-51
     */
    public CharSequence subSequence(int start, int end) {
        return stringBuilder.subSequence(start, end);
    }

    /**
     * Returns a new {@code String} that contains a subsequence of
     * characters currently contained in this sequence. The
     * substring begins at the specified {@code start} and
     * extends to the character at index {@code end - 1}.
     *
     * @param start The beginning index, inclusive.
     * @param end   The ending index, exclusive.
     * @return The new string.
     * @throws StringIndexOutOfBoundsException if {@code start}
     *                                         or {@code end} are negative or greater than
     *                                         {@code length()}, or {@code start} is
     *                                         greater than {@code end}.
     */
    public String substring(int start, int end) {
        return stringBuilder.substring(start, end);
    }

    /**
     * {@inheritDoc}
     *
     * @since 9
     */
    public IntStream chars() {
        return stringBuilder.chars();
    }

    /**
     * {@inheritDoc}
     *
     * @since 9
     */
    public IntStream codePoints() {
        return stringBuilder.codePoints();
    }

    /**
     * Compares two {@code CharSequence} instances lexicographically. Returns a
     * negative value, zero, or a positive value if the first sequence is lexicographically
     * less than, equal to, or greater than the second, respectively.
     *
     * <p>
     * The lexicographical ordering of {@code CharSequence} is defined as follows.
     * Consider a {@code CharSequence} <i>cs</i> of length <i>len</i> to be a
     * sequence of char values, <i>cs[0]</i> to <i>cs[len-1]</i>. Suppose <i>k</i>
     * is the lowest index at which the corresponding char values from each sequence
     * differ. The lexicographic ordering of the sequences is determined by a numeric
     * comparison of the char values <i>cs1[k]</i> with <i>cs2[k]</i>. If there is
     * no such index <i>k</i>, the shorter sequence is considered lexicographically
     * less than the other. If the sequences have the same length, the sequences are
     * considered lexicographically equal.
     *
     * @param cs1 the first {@code CharSequence}
     * @param cs2 the second {@code CharSequence}
     * @return the value {@code 0} if the two {@code CharSequence} are equal;
     * a negative integer if the first {@code CharSequence}
     * is lexicographically less than the second; or a
     * positive integer if the first {@code CharSequence} is
     * lexicographically greater than the second.
     * @since 11
     */
    public static int compare(CharSequence cs1, CharSequence cs2) {
        return CharSequence.compare(cs1, cs2);
    }
}
