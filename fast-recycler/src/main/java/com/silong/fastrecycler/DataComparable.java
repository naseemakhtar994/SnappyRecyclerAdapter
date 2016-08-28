package com.silong.fastrecycler;

public interface DataComparable<D> {

  boolean areContentsTheSame(D oldData, D newData);

  boolean areItemsTheSame(D oldData, D newData);
}