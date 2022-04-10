package net.ivajimlop.api.Service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ivajimlop.api.Entity.Album;
import net.ivajimlop.api.Repository.AlbumRepository;
import net.ivajimlop.api.Service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	@Override
	public Album guardar(Album album) {
		repoAlbums.save(album);
		return album;
	}

	@Override
	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);	
	}
	
	

}
