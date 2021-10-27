import image from "../assets/dRb.png";
import '../styles/header.css';

function Header(){
    return(
        <div className="header">
            <img src={image} alt="dRb Logo" />
            <div>
                <button>Isso</button>
                <button>É</button>
                <button>Encheção</button>
                <button>De</button>
                <button>Linguiça</button>
            </div>
        </div>
    );
}; 

export default Header;