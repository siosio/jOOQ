/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */

package org.jooq.impl;

import static org.jooq.impl.DSL.field;

import org.jooq.Configuration;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class Position extends AbstractFunction<Integer> {

    private static final long   serialVersionUID = 3544690069533526544L;

    private final Field<String> search;
    private final Field<?>      in;

    Position(Field<String> search, Field<?> in) {
        super("position", SQLDataType.INTEGER, search, in);

        this.search = search;
        this.in = in;
    }

    @Override
    final Field<Integer> getFunction0(Configuration configuration) {
        switch (configuration.dialect().family()) {
            /* [pro] xx
            xxxx xxxx
            xx [/pro] */
            case DERBY:
                return field("{locate}({0}, {1})", SQLDataType.INTEGER, search, in);

            /* [pro] xx
            xxxx xxxxx
            xxxx xxxxxxx
            xxxx xxxxxxx
                xxxxxx xxxxxxxxxxxxxxxxxxxx xxxxxx xxxxxxxxxxxxxxxxxxxx xxx xxxxxxxx

            xxxx xxxxxxx
            xxxx xxxxxxx
                xxxxxx xxxxxxxxxxxxxxxxxxx xxxxxx xxxxxxxxxxxxxxxxxxxx xxx xxxxxxxx

            xxxx xxxx
            xxxx xxxxxxxxxx
                xxxxxx xxxxxxxxxxxxxxxxxxxxxxx xxxxxx xxxxxxxxxxxxxxxxxxxx xxxxxxx xxxx

            xx [/pro] */
            default:
                return field("{position}({0} {in} {1})", SQLDataType.INTEGER, search, in);
        }
    }
}
