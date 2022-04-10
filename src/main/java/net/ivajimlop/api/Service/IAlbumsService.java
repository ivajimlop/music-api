package net.ivajimlop.api.Service;

import java.util.List;

import net.ivajimlop.api.Entity.Album;
import net.ivajimlop.api.Repository.AlbumRepository;

public interface IAlbumsService{

	List <Album> buscarTodos();
	Album guardar(Album album);
	void eliminar(int idAlbum);
}
