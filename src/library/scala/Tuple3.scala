/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Wed Jun 17 14:10:05 PDT 2009

package scala



/** Tuple3 is the canonical representation of a @see Product3
 *
 */
case class Tuple3[+T1, +T2, +T3](_1:T1,_2:T2,_3:T3)
  extends Product3[T1, T2, T3]
{
  override def toString() = "(" + _1 + "," + _2 + "," + _3 + ")"

}
