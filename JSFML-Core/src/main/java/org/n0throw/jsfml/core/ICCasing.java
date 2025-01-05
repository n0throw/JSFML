package org.n0throw.jsfml.core;

import jnr.ffi.LibraryLoader;

public interface ICCasing<T> {
    default T load(
            Class<T> clazz,
            String libraryName
    ) {
        return LibraryLoader.create(clazz).load(libraryName);
    }
}
