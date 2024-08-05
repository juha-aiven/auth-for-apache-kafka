/*
 * Copyright 2024 Aiven Oy https://aiven.io
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

package io.aiven.kafka.auth.audit;

import java.net.InetAddress;

import org.apache.kafka.common.security.auth.KafkaPrincipal;


public class Session {
    private final KafkaPrincipal principal;
    private final InetAddress clientAddress;

    public Session(final KafkaPrincipal principal, final InetAddress clientAddress) {
        this.principal = principal;
        this.clientAddress = clientAddress;
    }

    public KafkaPrincipal getPrincipal() {
        return principal;
    }

    public InetAddress getClientAddress() {
        return clientAddress;
    }
}
