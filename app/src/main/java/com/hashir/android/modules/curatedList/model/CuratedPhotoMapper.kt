package com.hashir.android.modules.curatedList.model

import com.hashir.android.util.EntityMapper
import javax.inject.Inject

class CuratedPhotoMapper
@Inject constructor() :
    EntityMapper<CuratedPhotosNetworkResponse.Photo, Photo> {
    override fun mapFromEntity(entity: CuratedPhotosNetworkResponse.Photo): Photo {
        return Photo(
            id = entity.id,
            url = entity.url,
            original = entity.src?.original,
            small = entity.src?.small,
            large = entity.src?.large,
            medium = entity.src?.medium,
            liked = entity.liked,
            photographerName = entity.photographer
        )
    }

    override fun mapToEntity(domainModel: Photo): CuratedPhotosNetworkResponse.Photo {
        return CuratedPhotosNetworkResponse.Photo(
            id = domainModel.id,
            url = domainModel.url,
            src = null,
            avgColor = null,
            height = null,
            width = null,
            liked = null,
            photographer = domainModel.photographerName,
            photographerId = null,
            photographerUrl = null
        )
    }

    fun mapFromEntityList(entities: List<CuratedPhotosNetworkResponse.Photo>): List<Photo> {
        return entities.map { mapFromEntity(it) }
    }
}