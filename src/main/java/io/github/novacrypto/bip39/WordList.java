package io.github.novacrypto.bip39;

/**
 * Created by aevans on 2017-10-07.
 */
public interface WordList {

    String getWord(final int index);

    char getSpace();
}
