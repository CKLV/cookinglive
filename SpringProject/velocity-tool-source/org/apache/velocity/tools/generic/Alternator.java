package org.apache.velocity.tools.generic;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.Collection;

/**
 * Utility class for easily alternating over values in a list.
 *
 * <p><b>Example usage:</b>
 * <pre>
 * java...
 *      String[] myColors = new String[]{"red", "blue"};
 *      context.put("color", new Alternator(myColors));
 *      String[] myStyles = new String[]{"hip", "fly", "groovy"};
 *      // demonstrate manual alternation with this one
 *      context.put("style", new Alternator(false, myStyles));
 *
 * template...
 *      #foreach( $foo in [1..5] )
 *       $foo is $color and $style.next
 *      #end
 *
 * output...
 *      1 is red and hip
 *      2 is blue and fly
 *      3 is red and groovy
 *      4 is blue and hip
 *      5 is red and fly
 * </pre></p>
 *
 * @since Velocity Tools 1.2
 * @version $Id: Alternator.java 603419 2007-12-12 00:04:07Z nbubna $
 */
public class Alternator
{
    private Object[] list;
    private int index = 0;
    private boolean auto = true;

    /**
     * Creates a new Alternator for the specified list.  Alternation
     * defaults to automatic.
     */
    public Alternator(Object... list)
    {
        this(true, list);
    }

    /**
     * Creates a new Alternator for the specified list with the specified
     * automatic shifting preference.
     *
     * @param auto See {@link #setAuto(boolean auto)}.
     * @param list The elements to alternate over
     */
    public Alternator(boolean auto, Object... list)
    {
        this.auto = auto;
        if (list.length == 1 && list[0] instanceof Collection)
        {
            this.list = ((Collection)list[0]).toArray();
        }
        else
        {
            this.list = list;
        }
    }

    /**
     * @return Whether this Alternator shifts the list index
     * automatically after a call to {@link #toString()}.
     */
    public boolean isAuto()
    {
        return auto;
    }

    /**
     * If set to true, the list index will shift automatically after a
     * call to toString().
     */
    public void setAuto(boolean auto)
    {
        this.auto = auto;
    }

    /**
     * Manually shifts the list index. If it reaches the end of the list,
     * it will start over again at zero.
     */
    public void shift()
    {
        index = (index + 1) % list.length;
    }

    /**
     * Returns the current item without shifting the list index.
     */
    public Object getCurrent()
    {
        return list[index];
    }

    /**
     * Returns the current item, then shifts the list index.
     */
    public Object getNext()
    {
        Object o = getCurrent();
        shift();
        return o;
    }

    /**
     * Returns a string representation of the current item or
     * <code>null</code> if the current item is null.  <b>If {@link
     * #auto} is true, this will shift after returning the current
     * item</b>.
     */
    public String toString()
    {
        Object o = list[index];
        if (auto)
        {
            shift();
        }
        if (o == null)
        {
            return null;
        }
        return o.toString();
    }

}
