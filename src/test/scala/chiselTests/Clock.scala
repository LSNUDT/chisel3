// See LICENSE for license details.

package chiselTests

import tags.RequiresBackend
import chisel3._
import chisel3.testers.BasicTester

class ClockAsUIntTester extends BasicTester {
  assert(true.B.asClock.asUInt === 1.U)
  stop()
}

@RequiresBackend
class ClockSpec extends ChiselPropSpec {
  property("Bool.asClock.asUInt should pass a signal through unaltered") {
    assertTesterPasses { new ClockAsUIntTester }
  }
}
