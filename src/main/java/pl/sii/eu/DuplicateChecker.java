package pl.sii.eu;

/**
 * Implement method hasDuplicateCharacters that will return true if given input string has any duplicated letters.
 * Method should be case sensitive and ignore whitespace characters.
 */
@FunctionalInterface
interface DuplicateChecker {

    boolean hasDuplicateCharacters(String input);
}
