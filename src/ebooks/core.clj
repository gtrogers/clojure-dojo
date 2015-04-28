(ns ebooks.core
  (:require [ebooks.markov :as m]))

(def riptide (slurp "resources/riptide.txt"))
(def thriftshop (slurp "resources/thriftshop.txt"))

(m/generate (str riptide " " thriftshop) 100)
