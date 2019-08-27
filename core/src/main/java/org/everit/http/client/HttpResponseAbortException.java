/*
 * Copyright © 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.http.client;

import org.everit.http.client.async.AsyncContentProvider;

/**
 * Thrown when an {@link AsyncContentProvider} is closed before its content is fully read.
 */
public class HttpResponseAbortException extends RuntimeException {

  private static final long serialVersionUID = 6844755262229476043L;

}
