/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.build.gradle.internal.cxx.json

import com.android.utils.TokenizedCommandLineMap

/**
 * Accepts a clang.exe command-line and parses it into a list of
 * tokens that is interned. This is all done with a shared index
 * to avoid allocating memory on a per-command basis.
 */
class CompileCommandFlagListInterner {
    private var map = TokenizedCommandLineMap<List<String>>(raw = false)
    fun internFlags(commandLine: String, sourceFile: String) =
        map.computeIfAbsent(commandLine, sourceFile) { tokens -> tokens.toTokenList() }
}