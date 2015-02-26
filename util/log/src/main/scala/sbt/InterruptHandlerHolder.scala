package sbt

/**
 * Created by ania on 12.02.15.
 */
object InterruptHandlerHolder {
  var handler: () => Unit = _
}
