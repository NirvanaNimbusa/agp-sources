/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.ide.common.symbols

/**
 * Exception thrown when failed to parse a resource directory.
 */
class ResourceDirectoryParseException : RuntimeException {

    /**
     * Creates a new exception.
     *
     * @param description a description of the exception
     */
    constructor(description: String) : super(description)

    /**
     * Creates a new exception.
     *
     * @param description a description of the exception
     * @param cause a cause of the exception
     */
    constructor(description: String, cause: Throwable) : super(description, cause)
}
