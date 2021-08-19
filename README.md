### Description:
This is a photos app that has the following features


- A curated list of photos that comes from a GET API (https://www.pexels.com/api/documentation/?language=javascript#photos-show)
- An offline list of saved photos. 
- A detail image page
- Detail page can further be zoomed in to get a clear picture
	
  
**Usage**:
- A viewpager with 2 tab
- Curated list of photos is coming from a GET call. It has page based pagination in it
- My collection section is for offline usage
- In curated photos list, click the save button in curated list to save that very picture into your collection	
- In my collection list, click the delete button to delete the image from your collection
- In both sections: you can click on the picture to get a zoomed view and future pinch it to your liking				

### Architecture Explanation:
_I chose to go with **MVVM-Clean-Repository-Architecure with Dagger-Hilt dependency injection**, also to make it more maintainable I chose to add domain layer structure to keep model separation at network layer, cache layer and domain layer._

Why did I choose MVVM?

- Scalable (with viewmodels unaware of views)
- Maintainable
- I don't need to worry about configuration changes
- Most importantly, my business logic is separated from my views. It keeps separation of concerns. Simply put, i love it when my views don't interfere with my business core logic

### Some major Components Used:
- Kotlin coroutines
- Paging 3 
- Room
- Navigation Component 
- Hilt dependency injection 
- Lifecycle 
- Material design 
- View binding
- Data binding
- ViewModels
- Livedata
- Moshi
- Kotlin coil
- Viewpager 2
- Binding Adapters
