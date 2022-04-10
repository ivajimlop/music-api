package net.ivajimlop.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ivajimlop.api.Entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
