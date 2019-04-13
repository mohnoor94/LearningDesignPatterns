package _08_decorator._01_string_decorator;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.text.Collator;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MagicString {
    private String string;

    public MagicString(String string) {
        this.string = string;
    }

    public long getNumberOfVowels() {
        return string.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".contains(c.toString().toLowerCase()))
                .count();
    }

    @Override
    public String toString() {
        return string;
    }

    // Delegate all the string methods! (Use your IDE!)


    /**
     * Returns the length of this string.
     * The length is equal to the number of <a href="Character.html#unicode">Unicode
     * code units</a> in the string.
     *
     * @return the length of the sequence of characters represented by this
     * object.
     */
    public int length() {
        return string.length();
    }

    /**
     * Returns {@code true} if, and only if, {@link #length()} is {@code 0}.
     *
     * @return {@code true} if {@link #length()} is {@code 0}, otherwise
     * {@code false}
     * @since 1.6
     */
    public boolean isEmpty() {
        return string.isEmpty();
    }

    /**
     * Returns the {@code char} value at the
     * specified index. An index ranges from {@code 0} to
     * {@code length() - 1}. The first {@code char} value of the sequence
     * is at index {@code 0}, the next at index {@code 1},
     * and so on, as for array indexing.
     *
     * <p>If the {@code char} value specified by the index is a
     * <a href="Character.html#unicode">surrogate</a>, the surrogate
     * value is returned.
     *
     * @param index the index of the {@code char} value.
     * @return the {@code char} value at the specified index of this string.
     * The first {@code char} value is at index {@code 0}.
     * @throws IndexOutOfBoundsException if the {@code index}
     *                                   argument is negative or not less than the length of this
     *                                   string.
     */
    public char charAt(int index) {
        return string.charAt(index);
    }

    /**
     * Returns the character (Unicode code point) at the specified
     * index. The index refers to {@code char} values
     * (Unicode code units) and ranges from {@code 0} to
     * {@link #length()}{@code  - 1}.
     *
     * <p> If the {@code char} value specified at the given index
     * is in the high-surrogate range, the following index is less
     * than the length of this {@code String}, and the
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
     *                                   string.
     * @since 1.5
     */
    public int codePointAt(int index) {
        return string.codePointAt(index);
    }

    /**
     * Returns the character (Unicode code point) before the specified
     * index. The index refers to {@code char} values
     * (Unicode code units) and ranges from {@code 1} to {@link
     * CharSequence#length() length}.
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
     *                                   of this string.
     * @since 1.5
     */
    public int codePointBefore(int index) {
        return string.codePointBefore(index);
    }

    /**
     * Returns the number of Unicode code points in the specified text
     * range of this {@code String}. The text range begins at the
     * specified {@code beginIndex} and extends to the
     * {@code char} at index {@code endIndex - 1}. Thus the
     * length (in {@code char}s) of the text range is
     * {@code endIndex-beginIndex}. Unpaired surrogates within
     * the text range count as one code point each.
     *
     * @param beginIndex the index to the first {@code char} of
     *                   the text range.
     * @param endIndex   the index after the last {@code char} of
     *                   the text range.
     * @return the number of Unicode code points in the specified text
     * range
     * @throws IndexOutOfBoundsException if the
     *                                   {@code beginIndex} is negative, or {@code endIndex}
     *                                   is larger than the length of this {@code String}, or
     *                                   {@code beginIndex} is larger than {@code endIndex}.
     * @since 1.5
     */
    public int codePointCount(int beginIndex, int endIndex) {
        return string.codePointCount(beginIndex, endIndex);
    }

    /**
     * Returns the index within this {@code String} that is
     * offset from the given {@code index} by
     * {@code codePointOffset} code points. Unpaired surrogates
     * within the text range given by {@code index} and
     * {@code codePointOffset} count as one code point each.
     *
     * @param index           the index to be offset
     * @param codePointOffset the offset in code points
     * @return the index within this {@code String}
     * @throws IndexOutOfBoundsException if {@code index}
     *                                   is negative or larger then the length of this
     *                                   {@code String}, or if {@code codePointOffset} is positive
     *                                   and the substring starting with {@code index} has fewer
     *                                   than {@code codePointOffset} code points,
     *                                   or if {@code codePointOffset} is negative and the substring
     *                                   before {@code index} has fewer than the absolute value
     *                                   of {@code codePointOffset} code points.
     * @since 1.5
     */
    public int offsetByCodePoints(int index, int codePointOffset) {
        return string.offsetByCodePoints(index, codePointOffset);
    }

    /**
     * Copies characters from this string into the destination character
     * array.
     * <p>
     * The first character to be copied is at index {@code srcBegin};
     * the last character to be copied is at index {@code srcEnd-1}
     * (thus the total number of characters to be copied is
     * {@code srcEnd-srcBegin}). The characters are copied into the
     * subarray of {@code dst} starting at index {@code dstBegin}
     * and ending at index:
     * <blockquote><pre>
     *     dstBegin + (srcEnd-srcBegin) - 1
     * </pre></blockquote>
     *
     * @param srcBegin index of the first character in the string
     *                 to copy.
     * @param srcEnd   index after the last character in the string
     *                 to copy.
     * @param dst      the destination array.
     * @param dstBegin the start offset in the destination array.
     * @throws IndexOutOfBoundsException If any of the following
     *                                   is true:
     *                                   <ul><li>{@code srcBegin} is negative.
     *                                   <li>{@code srcBegin} is greater than {@code srcEnd}
     *                                   <li>{@code srcEnd} is greater than the length of this
     *                                   string
     *                                   <li>{@code dstBegin} is negative
     *                                   <li>{@code dstBegin+(srcEnd-srcBegin)} is larger than
     *                                   {@code dst.length}</ul>
     */
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        string.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    /**
     * Copies characters from this string into the destination byte array. Each
     * byte receives the 8 low-order bits of the corresponding character. The
     * eight high-order bits of each character are not copied and do not
     * participate in the transfer in any way.
     *
     * <p> The first character to be copied is at index {@code srcBegin}; the
     * last character to be copied is at index {@code srcEnd-1}.  The total
     * number of characters to be copied is {@code srcEnd-srcBegin}. The
     * characters, converted to bytes, are copied into the subarray of {@code
     * dst} starting at index {@code dstBegin} and ending at index:
     *
     * <blockquote><pre>
     *     dstBegin + (srcEnd-srcBegin) - 1
     * </pre></blockquote>
     *
     * @param srcBegin Index of the first character in the string to copy
     * @param srcEnd   Index after the last character in the string to copy
     * @param dst      The destination array
     * @param dstBegin The start offset in the destination array
     * @throws IndexOutOfBoundsException If any of the following is true:
     *                                   <ul>
     *                                   <li> {@code srcBegin} is negative
     *                                   <li> {@code srcBegin} is greater than {@code srcEnd}
     *                                   <li> {@code srcEnd} is greater than the length of this String
     *                                   <li> {@code dstBegin} is negative
     *                                   <li> {@code dstBegin+(srcEnd-srcBegin)} is larger than {@code
     *                                   dst.length}
     *                                   </ul>
     * @deprecated This method does not properly convert characters into
     * bytes.  As of JDK&nbsp;1.1, the preferred way to do this is via the
     * {@link #getBytes()} method, which uses the platform's default charset.
     */
    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        string.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    /**
     * Encodes this {@code String} into a sequence of bytes using the named
     * charset, storing the result into a new byte array.
     *
     * <p> The behavior of this method when this string cannot be encoded in
     * the given charset is unspecified.  The {@link
     * CharsetEncoder} class should be used when more control
     * over the encoding process is required.
     *
     * @param charsetName The name of a supported {@linkplain Charset
     *                    charset}
     * @return The resultant byte array
     * @throws UnsupportedEncodingException If the named charset is not supported
     * @since 1.1
     */
    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return string.getBytes(charsetName);
    }

    /**
     * Encodes this {@code String} into a sequence of bytes using the given
     * {@linkplain Charset charset}, storing the result into a
     * new byte array.
     *
     * <p> This method always replaces malformed-input and unmappable-character
     * sequences with this charset's default replacement byte array.  The
     * {@link CharsetEncoder} class should be used when more
     * control over the encoding process is required.
     *
     * @param charset The {@linkplain Charset} to be used to encode
     *                the {@code String}
     * @return The resultant byte array
     * @since 1.6
     */
    public byte[] getBytes(Charset charset) {
        return string.getBytes(charset);
    }

    /**
     * Encodes this {@code String} into a sequence of bytes using the
     * platform's default charset, storing the result into a new byte array.
     *
     * <p> The behavior of this method when this string cannot be encoded in
     * the default charset is unspecified.  The {@link
     * CharsetEncoder} class should be used when more control
     * over the encoding process is required.
     *
     * @return The resultant byte array
     * @since 1.1
     */
    public byte[] getBytes() {
        return string.getBytes();
    }

    /**
     * Compares this string to the specified {@code StringBuffer}.  The result
     * is {@code true} if and only if this {@code String} represents the same
     * sequence of characters as the specified {@code StringBuffer}. This method
     * synchronizes on the {@code StringBuffer}.
     *
     * <p>For finer-grained String comparison, refer to
     * {@link Collator}.
     *
     * @param sb The {@code StringBuffer} to compare this {@code String} against
     * @return {@code true} if this {@code String} represents the same
     * sequence of characters as the specified {@code StringBuffer},
     * {@code false} otherwise
     * @since 1.4
     */
    public boolean contentEquals(StringBuffer sb) {
        return string.contentEquals(sb);
    }

    /**
     * Compares this string to the specified {@code CharSequence}.  The
     * result is {@code true} if and only if this {@code String} represents the
     * same sequence of char values as the specified sequence. Note that if the
     * {@code CharSequence} is a {@code StringBuffer} then the method
     * synchronizes on it.
     *
     * <p>For finer-grained String comparison, refer to
     * {@link Collator}.
     *
     * @param cs The sequence to compare this {@code String} against
     * @return {@code true} if this {@code String} represents the same
     * sequence of char values as the specified sequence, {@code
     * false} otherwise
     * @since 1.5
     */
    public boolean contentEquals(CharSequence cs) {
        return string.contentEquals(cs);
    }

    /**
     * Compares this {@code String} to another {@code String}, ignoring case
     * considerations.  Two strings are considered equal ignoring case if they
     * are of the same length and corresponding characters in the two strings
     * are equal ignoring case.
     *
     * <p> Two characters {@code c1} and {@code c2} are considered the same
     * ignoring case if at least one of the following is true:
     * <ul>
     * <li> The two characters are the same (as compared by the
     * {@code ==} operator)
     * <li> Calling {@code Character.toLowerCase(Character.toUpperCase(char))}
     * on each character produces the same result
     * </ul>
     *
     * <p>Note that this method does <em>not</em> take locale into account, and
     * will result in unsatisfactory results for certain locales.  The
     * {@link Collator} class provides locale-sensitive comparison.
     *
     * @param anotherString The {@code String} to compare this {@code String} against
     * @return {@code true} if the argument is not {@code null} and it
     * represents an equivalent {@code String} ignoring case; {@code
     * false} otherwise
     * @see #equals(Object)
     */
    public boolean equalsIgnoreCase(String anotherString) {
        return string.equalsIgnoreCase(anotherString);
    }

    /**
     * Compares two strings lexicographically.
     * The comparison is based on the Unicode value of each character in
     * the strings. The character sequence represented by this
     * {@code String} object is compared lexicographically to the
     * character sequence represented by the argument string. The result is
     * a negative integer if this {@code String} object
     * lexicographically precedes the argument string. The result is a
     * positive integer if this {@code String} object lexicographically
     * follows the argument string. The result is zero if the strings
     * are equal; {@code compareTo} returns {@code 0} exactly when
     * the {@link #equals(Object)} method would return {@code true}.
     * <p>
     * This is the definition of lexicographic ordering. If two strings are
     * different, then either they have different characters at some index
     * that is a valid index for both strings, or their lengths are different,
     * or both. If they have different characters at one or more index
     * positions, let <i>k</i> be the smallest such index; then the string
     * whose character at position <i>k</i> has the smaller value, as
     * determined by using the {@code <} operator, lexicographically precedes the
     * other string. In this case, {@code compareTo} returns the
     * difference of the two character values at position {@code k} in
     * the two string -- that is, the value:
     * <blockquote><pre>
     * this.charAt(k)-anotherString.charAt(k)
     * </pre></blockquote>
     * If there is no index position at which they differ, then the shorter
     * string lexicographically precedes the longer string. In this case,
     * {@code compareTo} returns the difference of the lengths of the
     * strings -- that is, the value:
     * <blockquote><pre>
     * this.length()-anotherString.length()
     * </pre></blockquote>
     *
     * <p>For finer-grained String comparison, refer to
     * {@link Collator}.
     *
     * @param anotherString the {@code String} to be compared.
     * @return the value {@code 0} if the argument string is equal to
     * this string; a value less than {@code 0} if this string
     * is lexicographically less than the string argument; and a
     * value greater than {@code 0} if this string is
     * lexicographically greater than the string argument.
     */
    public int compareTo(String anotherString) {
        return string.compareTo(anotherString);
    }

    /**
     * Compares two strings lexicographically, ignoring case
     * differences. This method returns an integer whose sign is that of
     * calling {@code compareTo} with normalized versions of the strings
     * where case differences have been eliminated by calling
     * {@code Character.toLowerCase(Character.toUpperCase(character))} on
     * each character.
     * <p>
     * Note that this method does <em>not</em> take locale into account,
     * and will result in an unsatisfactory ordering for certain locales.
     * The {@link Collator} class provides locale-sensitive comparison.
     *
     * @param str the {@code String} to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * specified String is greater than, equal to, or less
     * than this String, ignoring case considerations.
     * @see Collator
     * @since 1.2
     */
    public int compareToIgnoreCase(String str) {
        return string.compareToIgnoreCase(str);
    }

    /**
     * Tests if two string regions are equal.
     * <p>
     * A substring of this {@code String} object is compared to a substring
     * of the argument other. The result is true if these substrings
     * represent identical character sequences. The substring of this
     * {@code String} object to be compared begins at index {@code toffset}
     * and has length {@code len}. The substring of other to be compared
     * begins at index {@code ooffset} and has length {@code len}. The
     * result is {@code false} if and only if at least one of the following
     * is true:
     * <ul><li>{@code toffset} is negative.
     * <li>{@code ooffset} is negative.
     * <li>{@code toffset+len} is greater than the length of this
     * {@code String} object.
     * <li>{@code ooffset+len} is greater than the length of the other
     * argument.
     * <li>There is some nonnegative integer <i>k</i> less than {@code len}
     * such that:
     * {@code this.charAt(toffset + }<i>k</i>{@code ) != other.charAt(ooffset + }
     * <i>k</i>{@code )}
     * </ul>
     *
     * <p>Note that this method does <em>not</em> take locale into account.  The
     * {@link Collator} class provides locale-sensitive comparison.
     *
     * @param toffset the starting offset of the subregion in this string.
     * @param other   the string argument.
     * @param ooffset the starting offset of the subregion in the string
     *                argument.
     * @param len     the number of characters to compare.
     * @return {@code true} if the specified subregion of this string
     * exactly matches the specified subregion of the string argument;
     * {@code false} otherwise.
     */
    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return string.regionMatches(toffset, other, ooffset, len);
    }

    /**
     * Tests if two string regions are equal.
     * <p>
     * A substring of this {@code String} object is compared to a substring
     * of the argument {@code other}. The result is {@code true} if these
     * substrings represent character sequences that are the same, ignoring
     * case if and only if {@code ignoreCase} is true. The substring of
     * this {@code String} object to be compared begins at index
     * {@code toffset} and has length {@code len}. The substring of
     * {@code other} to be compared begins at index {@code ooffset} and
     * has length {@code len}. The result is {@code false} if and only if
     * at least one of the following is true:
     * <ul><li>{@code toffset} is negative.
     * <li>{@code ooffset} is negative.
     * <li>{@code toffset+len} is greater than the length of this
     * {@code String} object.
     * <li>{@code ooffset+len} is greater than the length of the other
     * argument.
     * <li>{@code ignoreCase} is {@code false} and there is some nonnegative
     * integer <i>k</i> less than {@code len} such that:
     * <blockquote><pre>
     * this.charAt(toffset+k) != other.charAt(ooffset+k)
     * </pre></blockquote>
     * <li>{@code ignoreCase} is {@code true} and there is some nonnegative
     * integer <i>k</i> less than {@code len} such that:
     * <blockquote><pre>
     * Character.toLowerCase(Character.toUpperCase(this.charAt(toffset+k))) !=
     * Character.toLowerCase(Character.toUpperCase(other.charAt(ooffset+k)))
     * </pre></blockquote>
     * </ul>
     *
     * <p>Note that this method does <em>not</em> take locale into account,
     * and will result in unsatisfactory results for certain locales when
     * {@code ignoreCase} is {@code true}.  The {@link Collator} class
     * provides locale-sensitive comparison.
     *
     * @param ignoreCase if {@code true}, ignore case when comparing
     *                   characters.
     * @param toffset    the starting offset of the subregion in this
     *                   string.
     * @param other      the string argument.
     * @param ooffset    the starting offset of the subregion in the string
     *                   argument.
     * @param len        the number of characters to compare.
     * @return {@code true} if the specified subregion of this string
     * matches the specified subregion of the string argument;
     * {@code false} otherwise. Whether the matching is exact
     * or case insensitive depends on the {@code ignoreCase}
     * argument.
     */
    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return string.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    /**
     * Tests if the substring of this string beginning at the
     * specified index starts with the specified prefix.
     *
     * @param prefix  the prefix.
     * @param toffset where to begin looking in this string.
     * @return {@code true} if the character sequence represented by the
     * argument is a prefix of the substring of this object starting
     * at index {@code toffset}; {@code false} otherwise.
     * The result is {@code false} if {@code toffset} is
     * negative or greater than the length of this
     * {@code String} object; otherwise the result is the same
     * as the result of the expression
     * <pre>
     *          this.substring(toffset).startsWith(prefix)
     *          </pre>
     */
    public boolean startsWith(String prefix, int toffset) {
        return string.startsWith(prefix, toffset);
    }

    /**
     * Tests if this string starts with the specified prefix.
     *
     * @param prefix the prefix.
     * @return {@code true} if the character sequence represented by the
     * argument is a prefix of the character sequence represented by
     * this string; {@code false} otherwise.
     * Note also that {@code true} will be returned if the
     * argument is an empty string or is equal to this
     * {@code String} object as determined by the
     * {@link #equals(Object)} method.
     * @since 1.0
     */
    public boolean startsWith(String prefix) {
        return string.startsWith(prefix);
    }

    /**
     * Tests if this string ends with the specified suffix.
     *
     * @param suffix the suffix.
     * @return {@code true} if the character sequence represented by the
     * argument is a suffix of the character sequence represented by
     * this object; {@code false} otherwise. Note that the
     * result will be {@code true} if the argument is the
     * empty string or is equal to this {@code String} object
     * as determined by the {@link #equals(Object)} method.
     */
    public boolean endsWith(String suffix) {
        return string.endsWith(suffix);
    }

    /**
     * Returns the index within this string of the first occurrence of
     * the specified character. If a character with value
     * {@code ch} occurs in the character sequence represented by
     * this {@code String} object, then the index (in Unicode
     * code units) of the first such occurrence is returned. For
     * values of {@code ch} in the range from 0 to 0xFFFF
     * (inclusive), this is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true. For other values of {@code ch}, it is the
     * smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.codePointAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in this
     * string, then {@code -1} is returned.
     *
     * @param ch a character (Unicode code point).
     * @return the index of the first occurrence of the character in the
     * character sequence represented by this object, or
     * {@code -1} if the character does not occur.
     */
    public int indexOf(int ch) {
        return string.indexOf(ch);
    }

    /**
     * Returns the index within this string of the first occurrence of the
     * specified character, starting the search at the specified index.
     * <p>
     * If a character with value {@code ch} occurs in the
     * character sequence represented by this {@code String}
     * object at an index no smaller than {@code fromIndex}, then
     * the index of the first such occurrence is returned. For values
     * of {@code ch} in the range from 0 to 0xFFFF (inclusive),
     * this is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &gt;= fromIndex)
     * </pre></blockquote>
     * is true. For other values of {@code ch}, it is the
     * smallest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.codePointAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &gt;= fromIndex)
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in this
     * string at or after position {@code fromIndex}, then
     * {@code -1} is returned.
     *
     * <p>
     * There is no restriction on the value of {@code fromIndex}. If it
     * is negative, it has the same effect as if it were zero: this entire
     * string may be searched. If it is greater than the length of this
     * string, it has the same effect as if it were equal to the length of
     * this string: {@code -1} is returned.
     *
     * <p>All indices are specified in {@code char} values
     * (Unicode code units).
     *
     * @param ch        a character (Unicode code point).
     * @param fromIndex the index to start the search from.
     * @return the index of the first occurrence of the character in the
     * character sequence represented by this object that is greater
     * than or equal to {@code fromIndex}, or {@code -1}
     * if the character does not occur.
     */
    public int indexOf(int ch, int fromIndex) {
        return string.indexOf(ch, fromIndex);
    }

    /**
     * Returns the index within this string of the last occurrence of
     * the specified character. For values of {@code ch} in the
     * range from 0 to 0xFFFF (inclusive), the index (in Unicode code
     * units) returned is the largest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true. For other values of {@code ch}, it is the
     * largest value <i>k</i> such that:
     * <blockquote><pre>
     * this.codePointAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true.  In either case, if no such character occurs in this
     * string, then {@code -1} is returned.  The
     * {@code String} is searched backwards starting at the last
     * character.
     *
     * @param ch a character (Unicode code point).
     * @return the index of the last occurrence of the character in the
     * character sequence represented by this object, or
     * {@code -1} if the character does not occur.
     */
    public int lastIndexOf(int ch) {
        return string.lastIndexOf(ch);
    }

    /**
     * Returns the index within this string of the last occurrence of
     * the specified character, searching backward starting at the
     * specified index. For values of {@code ch} in the range
     * from 0 to 0xFFFF (inclusive), the index returned is the largest
     * value <i>k</i> such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &lt;= fromIndex)
     * </pre></blockquote>
     * is true. For other values of {@code ch}, it is the
     * largest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.codePointAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &lt;= fromIndex)
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in this
     * string at or before position {@code fromIndex}, then
     * {@code -1} is returned.
     *
     * <p>All indices are specified in {@code char} values
     * (Unicode code units).
     *
     * @param ch        a character (Unicode code point).
     * @param fromIndex the index to start the search from. There is no
     *                  restriction on the value of {@code fromIndex}. If it is
     *                  greater than or equal to the length of this string, it has
     *                  the same effect as if it were equal to one less than the
     *                  length of this string: this entire string may be searched.
     *                  If it is negative, it has the same effect as if it were -1:
     *                  -1 is returned.
     * @return the index of the last occurrence of the character in the
     * character sequence represented by this object that is less
     * than or equal to {@code fromIndex}, or {@code -1}
     * if the character does not occur before that point.
     */
    public int lastIndexOf(int ch, int fromIndex) {
        return string.lastIndexOf(ch, fromIndex);
    }

    /**
     * Returns the index within this string of the first occurrence of the
     * specified substring.
     *
     * <p>The returned index is the smallest value {@code k} for which:
     * <pre>{@code
     * this.startsWith(str, k)
     * }</pre>
     * If no such value of {@code k} exists, then {@code -1} is returned.
     *
     * @param str the substring to search for.
     * @return the index of the first occurrence of the specified substring,
     * or {@code -1} if there is no such occurrence.
     */
    public int indexOf(String str) {
        return string.indexOf(str);
    }

    /**
     * Returns the index within this string of the first occurrence of the
     * specified substring, starting at the specified index.
     *
     * <p>The returned index is the smallest value {@code k} for which:
     * <pre>{@code
     *     k >= Math.min(fromIndex, this.length()) &&
     *                   this.startsWith(str, k)
     * }</pre>
     * If no such value of {@code k} exists, then {@code -1} is returned.
     *
     * @param str       the substring to search for.
     * @param fromIndex the index from which to start the search.
     * @return the index of the first occurrence of the specified substring,
     * starting at the specified index,
     * or {@code -1} if there is no such occurrence.
     */
    public int indexOf(String str, int fromIndex) {
        return string.indexOf(str, fromIndex);
    }

    /**
     * Returns the index within this string of the last occurrence of the
     * specified substring.  The last occurrence of the empty string ""
     * is considered to occur at the index value {@code this.length()}.
     *
     * <p>The returned index is the largest value {@code k} for which:
     * <pre>{@code
     * this.startsWith(str, k)
     * }</pre>
     * If no such value of {@code k} exists, then {@code -1} is returned.
     *
     * @param str the substring to search for.
     * @return the index of the last occurrence of the specified substring,
     * or {@code -1} if there is no such occurrence.
     */
    public int lastIndexOf(String str) {
        return string.lastIndexOf(str);
    }

    /**
     * Returns the index within this string of the last occurrence of the
     * specified substring, searching backward starting at the specified index.
     *
     * <p>The returned index is the largest value {@code k} for which:
     * <pre>{@code
     *     k <= Math.min(fromIndex, this.length()) &&
     *                   this.startsWith(str, k)
     * }</pre>
     * If no such value of {@code k} exists, then {@code -1} is returned.
     *
     * @param str       the substring to search for.
     * @param fromIndex the index to start the search from.
     * @return the index of the last occurrence of the specified substring,
     * searching backward from the specified index,
     * or {@code -1} if there is no such occurrence.
     */
    public int lastIndexOf(String str, int fromIndex) {
        return string.lastIndexOf(str, fromIndex);
    }

    /**
     * Returns a string that is a substring of this string. The
     * substring begins with the character at the specified index and
     * extends to the end of this string. <p>
     * Examples:
     * <blockquote><pre>
     * "unhappy".substring(2) returns "happy"
     * "Harbison".substring(3) returns "bison"
     * "emptiness".substring(9) returns "" (an empty string)
     * </pre></blockquote>
     *
     * @param beginIndex the beginning index, inclusive.
     * @return the specified substring.
     * @throws IndexOutOfBoundsException if
     *                                   {@code beginIndex} is negative or larger than the
     *                                   length of this {@code String} object.
     */
    public String substring(int beginIndex) {
        return string.substring(beginIndex);
    }

    /**
     * Returns a string that is a substring of this string. The
     * substring begins at the specified {@code beginIndex} and
     * extends to the character at index {@code endIndex - 1}.
     * Thus the length of the substring is {@code endIndex-beginIndex}.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     * </pre></blockquote>
     *
     * @param beginIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     * @throws IndexOutOfBoundsException if the
     *                                   {@code beginIndex} is negative, or
     *                                   {@code endIndex} is larger than the length of
     *                                   this {@code String} object, or
     *                                   {@code beginIndex} is larger than
     *                                   {@code endIndex}.
     */
    public String substring(int beginIndex, int endIndex) {
        return string.substring(beginIndex, endIndex);
    }

    /**
     * Returns a character sequence that is a subsequence of this sequence.
     *
     * <p> An invocation of this method of the form
     *
     * <blockquote><pre>
     * str.subSequence(begin,&nbsp;end)</pre></blockquote>
     * <p>
     * behaves in exactly the same way as the invocation
     *
     * <blockquote><pre>
     * str.substring(begin,&nbsp;end)</pre></blockquote>
     *
     * @param beginIndex the begin index, inclusive.
     * @param endIndex   the end index, exclusive.
     * @return the specified subsequence.
     * @throws IndexOutOfBoundsException if {@code beginIndex} or {@code endIndex} is negative,
     *                                   if {@code endIndex} is greater than {@code length()},
     *                                   or if {@code beginIndex} is greater than {@code endIndex}
     * @apiNote This method is defined so that the {@code String} class can implement
     * the {@link CharSequence} interface.
     * @spec JSR-51
     * @since 1.4
     */
    public CharSequence subSequence(int beginIndex, int endIndex) {
        return string.subSequence(beginIndex, endIndex);
    }

    /**
     * Concatenates the specified string to the end of this string.
     * <p>
     * If the length of the argument string is {@code 0}, then this
     * {@code String} object is returned. Otherwise, a
     * {@code String} object is returned that represents a character
     * sequence that is the concatenation of the character sequence
     * represented by this {@code String} object and the character
     * sequence represented by the argument string.<p>
     * Examples:
     * <blockquote><pre>
     * "cares".concat("s") returns "caress"
     * "to".concat("get").concat("her") returns "together"
     * </pre></blockquote>
     *
     * @param str the {@code String} that is concatenated to the end
     *            of this {@code String}.
     * @return a string that represents the concatenation of this object's
     * characters followed by the string argument's characters.
     */
    public String concat(String str) {
        return string.concat(str);
    }

    /**
     * Returns a string resulting from replacing all occurrences of
     * {@code oldChar} in this string with {@code newChar}.
     * <p>
     * If the character {@code oldChar} does not occur in the
     * character sequence represented by this {@code String} object,
     * then a reference to this {@code String} object is returned.
     * Otherwise, a {@code String} object is returned that
     * represents a character sequence identical to the character sequence
     * represented by this {@code String} object, except that every
     * occurrence of {@code oldChar} is replaced by an occurrence
     * of {@code newChar}.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "mesquite in your cellar".replace('e', 'o')
     *         returns "mosquito in your collar"
     * "the war of baronets".replace('r', 'y')
     *         returns "the way of bayonets"
     * "sparring with a purple porpoise".replace('p', 't')
     *         returns "starring with a turtle tortoise"
     * "JonL".replace('q', 'x') returns "JonL" (no change)
     * </pre></blockquote>
     *
     * @param oldChar the old character.
     * @param newChar the new character.
     * @return a string derived from this string by replacing every
     * occurrence of {@code oldChar} with {@code newChar}.
     */
    public String replace(char oldChar, char newChar) {
        return string.replace(oldChar, newChar);
    }

    /**
     * Tells whether or not this string matches the given <a
     * href="../util/regex/Pattern.html#sum">regular expression</a>.
     *
     * <p> An invocation of this method of the form
     * <i>str</i>{@code .matches(}<i>regex</i>{@code )} yields exactly the
     * same result as the expression
     *
     * <blockquote>
     * {@link Pattern}.{@link Pattern#matches(String, CharSequence)
     * matches(<i>regex</i>, <i>str</i>)}
     * </blockquote>
     *
     * @param regex the regular expression to which this string is to be matched
     * @return {@code true} if, and only if, this string matches the
     * given regular expression
     * @throws PatternSyntaxException if the regular expression's syntax is invalid
     * @spec JSR-51
     * @see Pattern
     * @since 1.4
     */
    public boolean matches(String regex) {
        return string.matches(regex);
    }

    /**
     * Returns true if and only if this string contains the specified
     * sequence of char values.
     *
     * @param s the sequence to search for
     * @return true if this string contains {@code s}, false otherwise
     * @since 1.5
     */
    public boolean contains(CharSequence s) {
        return string.contains(s);
    }

    /**
     * Replaces the first substring of this string that matches the given <a
     * href="../util/regex/Pattern.html#sum">regular expression</a> with the
     * given replacement.
     *
     * <p> An invocation of this method of the form
     * <i>str</i>{@code .replaceFirst(}<i>regex</i>{@code ,} <i>repl</i>{@code )}
     * yields exactly the same result as the expression
     *
     * <blockquote>
     * <code>
     * {@link Pattern}.{@link
     * Pattern#compile compile}(<i>regex</i>).{@link
     * Pattern#matcher(CharSequence) matcher}(<i>str</i>).{@link
     * Matcher#replaceFirst replaceFirst}(<i>repl</i>)
     * </code>
     * </blockquote>
     *
     * <p>
     * Note that backslashes ({@code \}) and dollar signs ({@code $}) in the
     * replacement string may cause the results to be different than if it were
     * being treated as a literal replacement string; see
     * {@link Matcher#replaceFirst}.
     * Use {@link Matcher#quoteReplacement} to suppress the special
     * meaning of these characters, if desired.
     *
     * @param regex       the regular expression to which this string is to be matched
     * @param replacement the string to be substituted for the first match
     * @return The resulting {@code String}
     * @throws PatternSyntaxException if the regular expression's syntax is invalid
     * @spec JSR-51
     * @see Pattern
     * @since 1.4
     */
    public String replaceFirst(String regex, String replacement) {
        return string.replaceFirst(regex, replacement);
    }

    /**
     * Replaces each substring of this string that matches the given <a
     * href="../util/regex/Pattern.html#sum">regular expression</a> with the
     * given replacement.
     *
     * <p> An invocation of this method of the form
     * <i>str</i>{@code .replaceAll(}<i>regex</i>{@code ,} <i>repl</i>{@code )}
     * yields exactly the same result as the expression
     *
     * <blockquote>
     * <code>
     * {@link Pattern}.{@link
     * Pattern#compile compile}(<i>regex</i>).{@link
     * Pattern#matcher(CharSequence) matcher}(<i>str</i>).{@link
     * Matcher#replaceAll replaceAll}(<i>repl</i>)
     * </code>
     * </blockquote>
     *
     * <p>
     * Note that backslashes ({@code \}) and dollar signs ({@code $}) in the
     * replacement string may cause the results to be different than if it were
     * being treated as a literal replacement string; see
     * {@link Matcher#replaceAll Matcher.replaceAll}.
     * Use {@link Matcher#quoteReplacement} to suppress the special
     * meaning of these characters, if desired.
     *
     * @param regex       the regular expression to which this string is to be matched
     * @param replacement the string to be substituted for each match
     * @return The resulting {@code String}
     * @throws PatternSyntaxException if the regular expression's syntax is invalid
     * @spec JSR-51
     * @see Pattern
     * @since 1.4
     */
    public String replaceAll(String regex, String replacement) {
        return string.replaceAll(regex, replacement);
    }

    /**
     * Replaces each substring of this string that matches the literal target
     * sequence with the specified literal replacement sequence. The
     * replacement proceeds from the beginning of the string to the end, for
     * example, replacing "aa" with "b" in the string "aaa" will result in
     * "ba" rather than "ab".
     *
     * @param target      The sequence of char values to be replaced
     * @param replacement The replacement sequence of char values
     * @return The resulting string
     * @since 1.5
     */
    public String replace(CharSequence target, CharSequence replacement) {
        return string.replace(target, replacement);
    }

    /**
     * Splits this string around matches of the given
     * <a href="../util/regex/Pattern.html#sum">regular expression</a>.
     *
     * <p> The array returned by this method contains each substring of this
     * string that is terminated by another substring that matches the given
     * expression or is terminated by the end of the string.  The substrings in
     * the array are in the order in which they occur in this string.  If the
     * expression does not match any part of the input then the resulting array
     * has just one element, namely this string.
     *
     * <p> When there is a positive-width match at the beginning of this
     * string then an empty leading substring is included at the beginning
     * of the resulting array. A zero-width match at the beginning however
     * never produces such empty leading substring.
     *
     * <p> The {@code limit} parameter controls the number of times the
     * pattern is applied and therefore affects the length of the resulting
     * array.
     * <ul>
     * <li><p>
     * If the <i>limit</i> is positive then the pattern will be applied
     * at most <i>limit</i>&nbsp;-&nbsp;1 times, the array's length will be
     * no greater than <i>limit</i>, and the array's last entry will contain
     * all input beyond the last matched delimiter.</p></li>
     *
     * <li><p>
     * If the <i>limit</i> is zero then the pattern will be applied as
     * many times as possible, the array can have any length, and trailing
     * empty strings will be discarded.</p></li>
     *
     * <li><p>
     * If the <i>limit</i> is negative then the pattern will be applied
     * as many times as possible and the array can have any length.</p></li>
     * </ul>
     *
     * <p> The string {@code "boo:and:foo"}, for example, yields the
     * following results with these parameters:
     *
     * <blockquote><table class="plain">
     * <caption style="display:none">Split example showing regex, limit, and result</caption>
     * <thead>
     * <tr>
     * <th scope="col">Regex</th>
     * <th scope="col">Limit</th>
     * <th scope="col">Result</th>
     * </tr>
     * </thead>
     * <tbody>
     * <tr><th scope="row" rowspan="3" style="font-weight:normal">:</th>
     * <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">2</th>
     * <td>{@code { "boo", "and:foo" }}</td></tr>
     * <tr><!-- : -->
     * <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">5</th>
     * <td>{@code { "boo", "and", "foo" }}</td></tr>
     * <tr><!-- : -->
     * <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">-2</th>
     * <td>{@code { "boo", "and", "foo" }}</td></tr>
     * <tr><th scope="row" rowspan="3" style="font-weight:normal">o</th>
     * <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">5</th>
     * <td>{@code { "b", "", ":and:f", "", "" }}</td></tr>
     * <tr><!-- o -->
     * <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">-2</th>
     * <td>{@code { "b", "", ":and:f", "", "" }}</td></tr>
     * <tr><!-- o -->
     * <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">0</th>
     * <td>{@code { "b", "", ":and:f" }}</td></tr>
     * </tbody>
     * </table></blockquote>
     *
     * <p> An invocation of this method of the form
     * <i>str.</i>{@code split(}<i>regex</i>{@code ,}&nbsp;<i>n</i>{@code )}
     * yields the same result as the expression
     *
     * <blockquote>
     * <code>
     * {@link Pattern}.{@link
     * Pattern#compile compile}(<i>regex</i>).{@link
     * Pattern#split(CharSequence, int) split}(<i>str</i>,&nbsp;<i>n</i>)
     * </code>
     * </blockquote>
     *
     * @param regex the delimiting regular expression
     * @param limit the result threshold, as described above
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression
     * @throws PatternSyntaxException if the regular expression's syntax is invalid
     * @spec JSR-51
     * @see Pattern
     * @since 1.4
     */
    public String[] split(String regex, int limit) {
        return string.split(regex, limit);
    }

    /**
     * Splits this string around matches of the given <a
     * href="../util/regex/Pattern.html#sum">regular expression</a>.
     *
     * <p> This method works as if by invoking the two-argument {@link
     * #split(String, int) split} method with the given expression and a limit
     * argument of zero.  Trailing empty strings are therefore not included in
     * the resulting array.
     *
     * <p> The string {@code "boo:and:foo"}, for example, yields the following
     * results with these expressions:
     *
     * <blockquote><table class="plain">
     * <caption style="display:none">Split examples showing regex and result</caption>
     * <thead>
     * <tr>
     * <th scope="col">Regex</th>
     * <th scope="col">Result</th>
     * </tr>
     * </thead>
     * <tbody>
     * <tr><th scope="row" style="text-weight:normal">:</th>
     * <td>{@code { "boo", "and", "foo" }}</td></tr>
     * <tr><th scope="row" style="text-weight:normal">o</th>
     * <td>{@code { "b", "", ":and:f" }}</td></tr>
     * </tbody>
     * </table></blockquote>
     *
     * @param regex the delimiting regular expression
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression
     * @throws PatternSyntaxException if the regular expression's syntax is invalid
     * @spec JSR-51
     * @see Pattern
     * @since 1.4
     */
    public String[] split(String regex) {
        return string.split(regex);
    }

    /**
     * Returns a new String composed of copies of the
     * {@code CharSequence elements} joined together with a copy of
     * the specified {@code delimiter}.
     *
     * <blockquote>For example,
     * <pre>{@code
     *     String message = String.join("-", "Java", "is", "cool");
     *     // message returned is: "Java-is-cool"
     * }</pre></blockquote>
     * <p>
     * Note that if an element is null, then {@code "null"} is added.
     *
     * @param delimiter the delimiter that separates each element
     * @param elements  the elements to join together.
     * @return a new {@code String} that is composed of the {@code elements}
     * separated by the {@code delimiter}
     * @throws NullPointerException If {@code delimiter} or {@code elements}
     *                              is {@code null}
     * @see StringJoiner
     * @since 1.8
     */
    public static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    /**
     * Returns a new {@code String} composed of copies of the
     * {@code CharSequence elements} joined together with a copy of the
     * specified {@code delimiter}.
     *
     * <blockquote>For example,
     * <pre>{@code
     *     List<String> strings = List.of("Java", "is", "cool");
     *     String message = String.join(" ", strings);
     *     //message returned is: "Java is cool"
     *
     *     Set<String> strings =
     *         new LinkedHashSet<>(List.of("Java", "is", "very", "cool"));
     *     String message = String.join("-", strings);
     *     //message returned is: "Java-is-very-cool"
     * }</pre></blockquote>
     * <p>
     * Note that if an individual element is {@code null}, then {@code "null"} is added.
     *
     * @param delimiter a sequence of characters that is used to separate each
     *                  of the {@code elements} in the resulting {@code String}
     * @param elements  an {@code Iterable} that will have its {@code elements}
     *                  joined together.
     * @return a new {@code String} that is composed from the {@code elements}
     * argument
     * @throws NullPointerException If {@code delimiter} or {@code elements}
     *                              is {@code null}
     * @see #join(CharSequence, CharSequence...)
     * @see StringJoiner
     * @since 1.8
     */
    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return String.join(delimiter, elements);
    }

    /**
     * Converts all of the characters in this {@code String} to lower
     * case using the rules of the given {@code Locale}.  Case mapping is based
     * on the Unicode Standard version specified by the {@link Character Character}
     * class. Since case mappings are not always 1:1 char mappings, the resulting
     * {@code String} may be a different length than the original {@code String}.
     * <p>
     * Examples of lowercase  mappings are in the following table:
     * <table class="plain">
     * <caption style="display:none">Lowercase mapping examples showing language code of locale, upper case, lower case, and description</caption>
     * <thead>
     * <tr>
     * <th scope="col">Language Code of Locale</th>
     * <th scope="col">Upper Case</th>
     * <th scope="col">Lower Case</th>
     * <th scope="col">Description</th>
     * </tr>
     * </thead>
     * <tbody>
     * <tr>
     * <td>tr (Turkish)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">&#92;u0130</th>
     * <td>&#92;u0069</td>
     * <td>capital letter I with dot above -&gt; small letter i</td>
     * </tr>
     * <tr>
     * <td>tr (Turkish)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">&#92;u0049</th>
     * <td>&#92;u0131</td>
     * <td>capital letter I -&gt; small letter dotless i </td>
     * </tr>
     * <tr>
     * <td>(all)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">French Fries</th>
     * <td>french fries</td>
     * <td>lowercased all chars in String</td>
     * </tr>
     * <tr>
     * <td>(all)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">
     * &Iota;&Chi;&Theta;&Upsilon;&Sigma;</th>
     * <td>&iota;&chi;&theta;&upsilon;&sigma;</td>
     * <td>lowercased all chars in String</td>
     * </tr>
     * </tbody>
     * </table>
     *
     * @param locale use the case transformation rules for this locale
     * @return the {@code String}, converted to lowercase.
     * @see String#toLowerCase()
     * @see String#toUpperCase()
     * @see String#toUpperCase(Locale)
     * @since 1.1
     */
    public String toLowerCase(Locale locale) {
        return string.toLowerCase(locale);
    }

    /**
     * Converts all of the characters in this {@code String} to lower
     * case using the rules of the default locale. This is equivalent to calling
     * {@code toLowerCase(Locale.getDefault())}.
     * <p>
     * <b>Note:</b> This method is locale sensitive, and may produce unexpected
     * results if used for strings that are intended to be interpreted locale
     * independently.
     * Examples are programming language identifiers, protocol keys, and HTML
     * tags.
     * For instance, {@code "TITLE".toLowerCase()} in a Turkish locale
     * returns {@code "t\u005Cu0131tle"}, where '\u005Cu0131' is the
     * LATIN SMALL LETTER DOTLESS I character.
     * To obtain correct results for locale insensitive strings, use
     * {@code toLowerCase(Locale.ROOT)}.
     *
     * @return the {@code String}, converted to lowercase.
     * @see String#toLowerCase(Locale)
     */
    public String toLowerCase() {
        return string.toLowerCase();
    }

    /**
     * Converts all of the characters in this {@code String} to upper
     * case using the rules of the given {@code Locale}. Case mapping is based
     * on the Unicode Standard version specified by the {@link Character Character}
     * class. Since case mappings are not always 1:1 char mappings, the resulting
     * {@code String} may be a different length than the original {@code String}.
     * <p>
     * Examples of locale-sensitive and 1:M case mappings are in the following table.
     *
     * <table class="plain">
     * <caption style="display:none">Examples of locale-sensitive and 1:M case mappings. Shows Language code of locale, lower case, upper case, and description.</caption>
     * <thead>
     * <tr>
     * <th scope="col">Language Code of Locale</th>
     * <th scope="col">Lower Case</th>
     * <th scope="col">Upper Case</th>
     * <th scope="col">Description</th>
     * </tr>
     * </thead>
     * <tbody>
     * <tr>
     * <td>tr (Turkish)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">&#92;u0069</th>
     * <td>&#92;u0130</td>
     * <td>small letter i -&gt; capital letter I with dot above</td>
     * </tr>
     * <tr>
     * <td>tr (Turkish)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">&#92;u0131</th>
     * <td>&#92;u0049</td>
     * <td>small letter dotless i -&gt; capital letter I</td>
     * </tr>
     * <tr>
     * <td>(all)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">&#92;u00df</th>
     * <td>&#92;u0053 &#92;u0053</td>
     * <td>small letter sharp s -&gt; two letters: SS</td>
     * </tr>
     * <tr>
     * <td>(all)</td>
     * <th scope="row" style="font-weight:normal; text-align:left">Fahrvergn&uuml;gen</th>
     * <td>FAHRVERGN&Uuml;GEN</td>
     * <td></td>
     * </tr>
     * </tbody>
     * </table>
     *
     * @param locale use the case transformation rules for this locale
     * @return the {@code String}, converted to uppercase.
     * @see String#toUpperCase()
     * @see String#toLowerCase()
     * @see String#toLowerCase(Locale)
     * @since 1.1
     */
    public String toUpperCase(Locale locale) {
        return string.toUpperCase(locale);
    }

    /**
     * Converts all of the characters in this {@code String} to upper
     * case using the rules of the default locale. This method is equivalent to
     * {@code toUpperCase(Locale.getDefault())}.
     * <p>
     * <b>Note:</b> This method is locale sensitive, and may produce unexpected
     * results if used for strings that are intended to be interpreted locale
     * independently.
     * Examples are programming language identifiers, protocol keys, and HTML
     * tags.
     * For instance, {@code "title".toUpperCase()} in a Turkish locale
     * returns {@code "T\u005Cu0130TLE"}, where '\u005Cu0130' is the
     * LATIN CAPITAL LETTER I WITH DOT ABOVE character.
     * To obtain correct results for locale insensitive strings, use
     * {@code toUpperCase(Locale.ROOT)}.
     *
     * @return the {@code String}, converted to uppercase.
     * @see String#toUpperCase(Locale)
     */
    public String toUpperCase() {
        return string.toUpperCase();
    }

    /**
     * Returns a string whose value is this string, with all leading
     * and trailing space removed, where space is defined
     * as any character whose codepoint is less than or equal to
     * {@code 'U+0020'} (the space character).
     * <p>
     * If this {@code String} object represents an empty character
     * sequence, or the first and last characters of character sequence
     * represented by this {@code String} object both have codes
     * that are not space (as defined above), then a
     * reference to this {@code String} object is returned.
     * <p>
     * Otherwise, if all characters in this string are space (as
     * defined above), then a  {@code String} object representing an
     * empty string is returned.
     * <p>
     * Otherwise, let <i>k</i> be the index of the first character in the
     * string whose code is not a space (as defined above) and let
     * <i>m</i> be the index of the last character in the string whose code
     * is not a space (as defined above). A {@code String}
     * object is returned, representing the substring of this string that
     * begins with the character at index <i>k</i> and ends with the
     * character at index <i>m</i>-that is, the result of
     * {@code this.substring(k, m + 1)}.
     * <p>
     * This method may be used to trim space (as defined above) from
     * the beginning and end of a string.
     *
     * @return a string whose value is this string, with all leading
     * and trailing space removed, or this string if it
     * has no leading or trailing space.
     */
    public String trim() {
        return string.trim();
    }

    /**
     * Returns a string whose value is this string, with all leading
     * and trailing {@link Character#isWhitespace(int) white space}
     * removed.
     * <p>
     * If this {@code String} object represents an empty string,
     * or if all code points in this string are
     * {@link Character#isWhitespace(int) white space}, then an empty string
     * is returned.
     * <p>
     * Otherwise, returns a substring of this string beginning with the first
     * code point that is not a {@link Character#isWhitespace(int) white space}
     * up to and including the last code point that is not a
     * {@link Character#isWhitespace(int) white space}.
     * <p>
     * This method may be used to strip
     * {@link Character#isWhitespace(int) white space} from
     * the beginning and end of a string.
     *
     * @return a string whose value is this string, with all leading
     * and trailing white space removed
     * @see Character#isWhitespace(int)
     * @since 11
     */
    public String strip() {
        return string.strip();
    }

    /**
     * Returns a string whose value is this string, with all leading
     * {@link Character#isWhitespace(int) white space} removed.
     * <p>
     * If this {@code String} object represents an empty string,
     * or if all code points in this string are
     * {@link Character#isWhitespace(int) white space}, then an empty string
     * is returned.
     * <p>
     * Otherwise, returns a substring of this string beginning with the first
     * code point that is not a {@link Character#isWhitespace(int) white space}
     * up to to and including the last code point of this string.
     * <p>
     * This method may be used to trim
     * {@link Character#isWhitespace(int) white space} from
     * the beginning of a string.
     *
     * @return a string whose value is this string, with all leading white
     * space removed
     * @see Character#isWhitespace(int)
     * @since 11
     */
    public String stripLeading() {
        return string.stripLeading();
    }

    /**
     * Returns a string whose value is this string, with all trailing
     * {@link Character#isWhitespace(int) white space} removed.
     * <p>
     * If this {@code String} object represents an empty string,
     * or if all characters in this string are
     * {@link Character#isWhitespace(int) white space}, then an empty string
     * is returned.
     * <p>
     * Otherwise, returns a substring of this string beginning with the first
     * code point of this string up to and including the last code point
     * that is not a {@link Character#isWhitespace(int) white space}.
     * <p>
     * This method may be used to trim
     * {@link Character#isWhitespace(int) white space} from
     * the end of a string.
     *
     * @return a string whose value is this string, with all trailing white
     * space removed
     * @see Character#isWhitespace(int)
     * @since 11
     */
    public String stripTrailing() {
        return string.stripTrailing();
    }

    /**
     * Returns {@code true} if the string is empty or contains only
     * {@link Character#isWhitespace(int) white space} codepoints,
     * otherwise {@code false}.
     *
     * @return {@code true} if the string is empty or contains only
     * {@link Character#isWhitespace(int) white space} codepoints,
     * otherwise {@code false}
     * @see Character#isWhitespace(int)
     * @since 11
     */
    public boolean isBlank() {
        return string.isBlank();
    }

    /**
     * Returns a stream of lines extracted from this string,
     * separated by line terminators.
     * <p>
     * A <i>line terminator</i> is one of the following:
     * a line feed character {@code "\n"} (U+000A),
     * a carriage return character {@code "\r"} (U+000D),
     * or a carriage return followed immediately by a line feed
     * {@code "\r\n"} (U+000D U+000A).
     * <p>
     * A <i>line</i> is either a sequence of zero or more characters
     * followed by a line terminator, or it is a sequence of one or
     * more characters followed by the end of the string. A
     * line does not include the line terminator.
     * <p>
     * The stream returned by this method contains the lines from
     * this string in the order in which they occur.
     *
     * @return the stream of lines extracted from this string
     * @apiNote This definition of <i>line</i> implies that an empty
     * string has zero lines and that there is no empty line
     * following a line terminator at the end of a string.
     * @implNote This method provides better performance than
     * split("\R") by supplying elements lazily and
     * by faster search of new line terminators.
     * @since 11
     */
    public Stream<String> lines() {
        return string.lines();
    }

    /**
     * Returns a stream of {@code int} zero-extending the {@code char} values
     * from this sequence.  Any char which maps to a <a
     * href="{@docRoot}/java.base/java/lang/Character.html#unicode">surrogate code
     * point</a> is passed through uninterpreted.
     *
     * @return an IntStream of char values from this sequence
     * @since 9
     */
    public IntStream chars() {
        return string.chars();
    }

    /**
     * Returns a stream of code point values from this sequence.  Any surrogate
     * pairs encountered in the sequence are combined as if by {@linkplain
     * Character#toCodePoint Character.toCodePoint} and the result is passed
     * to the stream. Any other code units, including ordinary BMP characters,
     * unpaired surrogates, and undefined code units, are zero-extended to
     * {@code int} values which are then passed to the stream.
     *
     * @return an IntStream of Unicode code points from this sequence
     * @since 9
     */
    public IntStream codePoints() {
        return string.codePoints();
    }

    /**
     * Converts this string to a new character array.
     *
     * @return a newly allocated character array whose length is the length
     * of this string and whose contents are initialized to contain
     * the character sequence represented by this string.
     */
    public char[] toCharArray() {
        return string.toCharArray();
    }

    /**
     * Returns a formatted string using the specified format string and
     * arguments.
     *
     * <p> The locale always used is the one returned by {@link
     * Locale#getDefault(Locale.Category)
     * Locale.getDefault(Locale.Category)} with
     * {@link Locale.Category#FORMAT FORMAT} category specified.
     *
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args   Arguments referenced by the format specifiers in the format
     *               string.  If there are more arguments than format specifiers, the
     *               extra arguments are ignored.  The number of arguments is
     *               variable and may be zero.  The maximum number of arguments is
     *               limited by the maximum dimension of a Java array as defined by
     *               <cite>The Java&trade; Virtual Machine Specification</cite>.
     *               The behaviour on a
     *               {@code null} argument depends on the <a
     *               href="../util/Formatter.html#syntax">conversion</a>.
     * @return A formatted string
     * @throws IllegalFormatException If a format string contains an illegal syntax, a format
     *                                specifier that is incompatible with the given arguments,
     *                                insufficient arguments given the format string, or other
     *                                illegal conditions.  For specification of all possible
     *                                formatting errors, see the <a
     *                                href="../util/Formatter.html#detail">Details</a> section of the
     *                                formatter class specification.
     * @see Formatter
     * @since 1.5
     */
    public static String format(String format, Object... args) {
        return String.format(format, args);
    }

    /**
     * Returns a formatted string using the specified locale, format string,
     * and arguments.
     *
     * @param l      The {@linkplain Locale locale} to apply during
     *               formatting.  If {@code l} is {@code null} then no localization
     *               is applied.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args   Arguments referenced by the format specifiers in the format
     *               string.  If there are more arguments than format specifiers, the
     *               extra arguments are ignored.  The number of arguments is
     *               variable and may be zero.  The maximum number of arguments is
     *               limited by the maximum dimension of a Java array as defined by
     *               <cite>The Java&trade; Virtual Machine Specification</cite>.
     *               The behaviour on a
     *               {@code null} argument depends on the
     *               <a href="../util/Formatter.html#syntax">conversion</a>.
     * @return A formatted string
     * @throws IllegalFormatException If a format string contains an illegal syntax, a format
     *                                specifier that is incompatible with the given arguments,
     *                                insufficient arguments given the format string, or other
     *                                illegal conditions.  For specification of all possible
     *                                formatting errors, see the <a
     *                                href="../util/Formatter.html#detail">Details</a> section of the
     *                                formatter class specification
     * @see Formatter
     * @since 1.5
     */
    public static String format(Locale l, String format, Object... args) {
        return String.format(l, format, args);
    }

    /**
     * Returns the string representation of the {@code Object} argument.
     *
     * @param obj an {@code Object}.
     * @return if the argument is {@code null}, then a string equal to
     * {@code "null"}; otherwise, the value of
     * {@code obj.toString()} is returned.
     * @see Object#toString()
     */
    public static String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    /**
     * Returns the string representation of the {@code char} array
     * argument. The contents of the character array are copied; subsequent
     * modification of the character array does not affect the returned
     * string.
     *
     * @param data the character array.
     * @return a {@code String} that contains the characters of the
     * character array.
     */
    public static String valueOf(char[] data) {
        return String.valueOf(data);
    }

    /**
     * Returns the string representation of a specific subarray of the
     * {@code char} array argument.
     * <p>
     * The {@code offset} argument is the index of the first
     * character of the subarray. The {@code count} argument
     * specifies the length of the subarray. The contents of the subarray
     * are copied; subsequent modification of the character array does not
     * affect the returned string.
     *
     * @param data   the character array.
     * @param offset initial offset of the subarray.
     * @param count  length of the subarray.
     * @return a {@code String} that contains the characters of the
     * specified subarray of the character array.
     * @throws IndexOutOfBoundsException if {@code offset} is
     *                                   negative, or {@code count} is negative, or
     *                                   {@code offset+count} is larger than
     *                                   {@code data.length}.
     */
    public static String valueOf(char[] data, int offset, int count) {
        return String.valueOf(data, offset, count);
    }

    /**
     * Equivalent to {@link #valueOf(char[], int, int)}.
     *
     * @param data   the character array.
     * @param offset initial offset of the subarray.
     * @param count  length of the subarray.
     * @return a {@code String} that contains the characters of the
     * specified subarray of the character array.
     * @throws IndexOutOfBoundsException if {@code offset} is
     *                                   negative, or {@code count} is negative, or
     *                                   {@code offset+count} is larger than
     *                                   {@code data.length}.
     */
    public static String copyValueOf(char[] data, int offset, int count) {
        return String.copyValueOf(data, offset, count);
    }

    /**
     * Equivalent to {@link #valueOf(char[])}.
     *
     * @param data the character array.
     * @return a {@code String} that contains the characters of the
     * character array.
     */
    public static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    /**
     * Returns the string representation of the {@code boolean} argument.
     *
     * @param b a {@code boolean}.
     * @return if the argument is {@code true}, a string equal to
     * {@code "true"} is returned; otherwise, a string equal to
     * {@code "false"} is returned.
     */
    public static String valueOf(boolean b) {
        return String.valueOf(b);
    }

    /**
     * Returns the string representation of the {@code char}
     * argument.
     *
     * @param c a {@code char}.
     * @return a string of length {@code 1} containing
     * as its single character the argument {@code c}.
     */
    public static String valueOf(char c) {
        return String.valueOf(c);
    }

    /**
     * Returns the string representation of the {@code int} argument.
     * <p>
     * The representation is exactly the one returned by the
     * {@code Integer.toString} method of one argument.
     *
     * @param i an {@code int}.
     * @return a string representation of the {@code int} argument.
     * @see Integer#toString(int, int)
     */
    public static String valueOf(int i) {
        return String.valueOf(i);
    }

    /**
     * Returns the string representation of the {@code long} argument.
     * <p>
     * The representation is exactly the one returned by the
     * {@code Long.toString} method of one argument.
     *
     * @param l a {@code long}.
     * @return a string representation of the {@code long} argument.
     * @see Long#toString(long)
     */
    public static String valueOf(long l) {
        return String.valueOf(l);
    }

    /**
     * Returns the string representation of the {@code float} argument.
     * <p>
     * The representation is exactly the one returned by the
     * {@code Float.toString} method of one argument.
     *
     * @param f a {@code float}.
     * @return a string representation of the {@code float} argument.
     * @see Float#toString(float)
     */
    public static String valueOf(float f) {
        return String.valueOf(f);
    }

    /**
     * Returns the string representation of the {@code double} argument.
     * <p>
     * The representation is exactly the one returned by the
     * {@code Double.toString} method of one argument.
     *
     * @param d a {@code double}.
     * @return a  string representation of the {@code double} argument.
     * @see Double#toString(double)
     */
    public static String valueOf(double d) {
        return String.valueOf(d);
    }

    /**
     * Returns a canonical representation for the string object.
     * <p>
     * A pool of strings, initially empty, is maintained privately by the
     * class {@code String}.
     * <p>
     * When the intern method is invoked, if the pool already contains a
     * string equal to this {@code String} object as determined by
     * the {@link #equals(Object)} method, then the string from the pool is
     * returned. Otherwise, this {@code String} object is added to the
     * pool and a reference to this {@code String} object is returned.
     * <p>
     * It follows that for any two strings {@code s} and {@code t},
     * {@code s.intern() == t.intern()} is {@code true}
     * if and only if {@code s.equals(t)} is {@code true}.
     * <p>
     * All literal strings and string-valued constant expressions are
     * interned. String literals are defined in section 3.10.5 of the
     * <cite>The Java&trade; Language Specification</cite>.
     *
     * @return a string that has the same contents as this string, but is
     * guaranteed to be from a pool of unique strings.
     * @jls 3.10.5 String Literals
     */
    public String intern() {
        return string.intern();
    }

    /**
     * Returns a string whose value is the concatenation of this
     * string repeated {@code count} times.
     * <p>
     * If this string is empty or count is zero then the empty
     * string is returned.
     *
     * @param count number of times to repeat
     * @return A string composed of this string repeated
     * {@code count} times or the empty string if this
     * string is empty or count is zero
     * @throws IllegalArgumentException if the {@code count} is
     *                                  negative.
     * @since 11
     */
    public String repeat(int count) {
        return string.repeat(count);
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
