/*
 * Copyright (c) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.data.webmastertools.v2;

/**
 * Constants for the Google Webmaster Tools Data API.
 *
 * @since 2.3
 */
public final class GoogleWebmasterTools {

  /** Version name. */
  public static final String VERSION = "2";

  /** Root URL. */
  public static final String ROOT_URL =
      "http://www.google.com/webmasters/tools/feeds/";

  /** The authentication token type used for Client Login. */
  public static final String AUTH_TOKEN_TYPE = "sitemaps";

  private GoogleWebmasterTools() {
  }
}
