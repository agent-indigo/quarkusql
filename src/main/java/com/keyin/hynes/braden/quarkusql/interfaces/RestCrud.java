package com.keyin.hynes.braden.quarkusql.interfaces;
import java.util.List;
public interface RestCrud<E, I> {
  List<E> getAll();
  E getOne(final I id);
  E add(final E post);
  E edit(
    final I id,
    final E changes
  );
  Boolean delete(final I id);
}