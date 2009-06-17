/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Wed Jun 17 14:10:05 PDT 2009 (with fancy comment)

package scala



/** <p>
 *    Function with 0 parameters.
 *  </p>
 *  <p>
 * In the following example the definition of
 *    <code>currentSeconds</code> is a shorthand for the anonymous class
 *    definition <code>anonfun0</code>:
 *  </p>
 *  <pre>
 *  <b>object</b> Main <b>extends</b> Application {
 *
 *    <b>val</b> currentSeconds = () => System.currentTimeMillis() / 1000L
 *
 *    <b>val</b> anonfun0 = <b>new</b> Function0[Long] {
 *      <b>def</b> apply(): Long = System.currentTimeMillis() / 1000L
 *    }
 *
 *    println(currentSeconds())
 *    println(anonfun0())
 *  }</pre>
 */
trait Function0[+R] extends AnyRef { self =>
  def apply(): R
  override def toString() = "<function0>"

}
