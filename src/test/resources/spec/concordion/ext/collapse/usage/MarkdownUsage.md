# Collapse Output Extension Usage

This test demonstrates the usage of the collapse output extension when using a Markdown format.

In order to use this extension with Markdown, we rely on [Inline HTML](http://daringfireball.net/projects/markdown/syntax#html)
within the Markdown spec. 

Note that all of the markup within the inline HTML needs to use HTML format. The parser that we are using is consistent with John Gruber's Markdown spec which states: 

`Markdown formatting syntax is not processed within block-level HTML tags. 
E.g., you can’t use Markdown-style *emphasis* inside an HTML block.` 

_(However we may change to a different Markdown 
parser in future that does allow markdown syntax within HTML)._

When using Markdown format specifications, the additional namespace needs to be declared in the fixture class
 
     @RunWith(ConcordionRunner.class)
     @ConcordionOptions(declareNamespaces={"ext", "urn:concordion-extensions:2010"})
     @Extensions(CollapseOutputExtension.class)
     public class ....
     
## [Example](- "")

For example, this Markdown format specification contains inline HTML

    <div class='collapsible'>
    <p>
    Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
    Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
    Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
    Mauris placerat eleifend leo.
    </p>
    
    <ul>
    <li>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</li> 
    <li>Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</li>
    <li>Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est.</li>
    <li>Mauris placerat eleifend leo.</li>
    </ul>
    
    ...
    </div>

when processed by Concordion, this becomes collapsible:

<div class='collapsible'>
<p>
Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
Mauris placerat eleifend leo.
</p>

<ul>
<li>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</li> 
<li>Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.</li>
<li>Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est.</li>
<li>Mauris placerat eleifend leo.</li>
</ul>

<p>
Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
Mauris placerat eleifend leo.
</p>

<p>
Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
Mauris placerat eleifend leo.
</p>
</div>

[This is just a dummy assertion.](- "c:assertTrue=returnTrue()")

The next section is not collapsible:

Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
Mauris placerat eleifend leo.
		
* Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
* Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
* Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
* Mauris placerat eleifend leo.
		
Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
Mauris placerat eleifend leo.
		
Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. 
Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. 
Mauris placerat eleifend leo.