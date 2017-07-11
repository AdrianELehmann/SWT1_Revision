package net.adrianlehmann.swt_revision.patterns.variation_patterns;

import java.util.Collection;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public interface Sorter {
   <T extends Comparable<T>> void sort(Collection<T> toBeSorted);
}
