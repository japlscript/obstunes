/*
 * =================================================
 * Copyright 2021 tagtraum industries incorporated
 * All rights reserved.
 * =================================================
 */
package com.tagtraum.macos.itunes;

import com.tagtraum.japlscript.execution.JaplScriptException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * TestApplication.
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 */
public class TestApplication {

    @Test
    @EnabledIfSystemProperty(named = "os.version",
        matches = "10\\.14\\..*",
        disabledReason = "Test only enabled on macOS 10.14")
    public void testVersion() {
        final Application application = Application.getInstance();
        final String version = application.getVersion();
        assertNotNull(version);
        assertFalse(version.trim().isEmpty());
    }

    @Test
    @EnabledIfSystemProperty(named = "os.version",
        matches = "10\\.14\\..*",
        disabledReason = "Test only enabled on macOS 10.14")
    public void testLibraryPlaylistCount() {
        final Application application = Application.getInstance();
        final LibraryPlaylist libraryPlaylist = application.getSources()[0].getLibraryPlaylists()[0];
        System.out.println("Tracks: " + libraryPlaylist.countTracks());
    }

    @Test
    @EnabledIfSystemProperty(named = "os.version",
        matches = "10\\.14\\..*",
        disabledReason = "Test only enabled on macOS 10.14")
    public void testCurrentlyPLaying() {
        final Application application = Application.getInstance();
        try {
            final Track currentTrack = application.getCurrentTrack();
            System.out.println("Current track: " + currentTrack.getName() + " by " + currentTrack.getArtist());
        } catch(JaplScriptException e) {
            System.out.println("No track loaded (we assume).");
        }
    }
}
