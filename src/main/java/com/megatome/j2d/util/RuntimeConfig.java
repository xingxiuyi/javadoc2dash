/**
 * Copyright 2015 Megatome Technologies, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.megatome.j2d.util;

import java.io.OutputStream;

/**
 * Utility class to hold static runtime configuration.
 */
public final class RuntimeConfig {
    private static boolean verbose = false;

    private RuntimeConfig() {}

    public static boolean isVerbose() {
        return verbose;
    }

    public static void setVerbose(boolean verbose) {
        RuntimeConfig.verbose = verbose;
    }

    public static void printIfVerbose(String message) {
        if (verbose) {
            System.out.println(message);
        }
    }
}
