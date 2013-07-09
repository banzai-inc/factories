(ns factories.core)

(defmacro defactory
  [fname defaults]
  `(defn ~fname
     ([] ~defaults)
     ([args#] (merge ~defaults args#))))
