(ns laconic-os.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [laconic-os.core-test]))

(doo-tests 'laconic-os.core-test)

