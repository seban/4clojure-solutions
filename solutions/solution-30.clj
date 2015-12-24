(defn solution-30
  ;; Write a function which removes consecutive duplicates from a sequence.
  [coll]
  (map first (partition-by identity coll)))
