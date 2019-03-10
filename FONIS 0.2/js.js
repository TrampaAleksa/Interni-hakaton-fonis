var json;

fetch('http://example.com/movies.json')
  .then(function(response) {
    return response.json();
  })
  .then(function(myJson) {
    console.log(JSON.stringify(myJson));
  });




console.log(json);
const cards = document.querySelector('.cards');

for (const object of json) {
    console.log(object);
    cards.innerHTML += `<div class="col s12 m4"><div class="card blue-grey darken-1">
    <div class="card-content white-text">
      <span class="card-title">${object.title}<span class="datum"> Objavljeno: 9.3.2019.</span></span>
      <p>Sutra se zatvaraju prijave za FONHakaton. Podrzite kolege i podelite materijale na drustvenim mrezama!</p>
    </div>
    <div class="card-action">
      <a href="#">FB materijali</a>
      <a href="#">Insta materijali</a>
    </div>
  </div>`
}

json[0].title;