/*
 * Copyright 2021-present DEEPINTHINK. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.deepinthink.magoko.pay.server.single;

import org.deepinthink.magoko.boot.banner.MagOKOBanner;
import org.deepinthink.magoko.pay.server.EnablePayServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnablePayServer
@SpringBootApplication
public class PayServerApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder()
        .sources(PayServerApplication.class)
        .banner(
            MagOKOBanner.builder()
                .tag("Pay Server Standalone Application")
                .tag("For more information, please visit our website:")
                .tag("\thttps://magoko.deepinthink.org/magoko-pay")
                .build())
        .run(args);
  }
}
