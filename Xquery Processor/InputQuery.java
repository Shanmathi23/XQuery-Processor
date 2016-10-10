Q1
<result>

{ document("j_caesar.xml")//(ACT,PERSONAE)/TITLE}

</result>

Q2
<SCENES> {

document("j_caesar.xml")//ACT[./TITLE]/*/SPEECH/../TITLE

}</SCENES>

Q3
<result>
{
for $a in (for $s in document("j_caesar.xml")//ACT return $s), $sc in $a/SCENE,	$sp in $sc/SPEECH where $sp/LINE/text()="No worthier than the dust!" return <speaks>{ <speaker>{$sp/SPEAKER/text()}</speaker>, <when>{ <act>{$a/TITLE/text()}</act>,	<scene>{$sc/TITLE/text()}</scene>} </when>}</speaks>
}
</result>

Q4

<result>
{
for $a in document("j_caesar.xml")//ACT let $sc:=$a/SCENE, $sp:=$sc/SPEECH where $sp/LINE/text()="No worthier than the dust!" return <speaks>{
<who>{$sp/SPEAKER/text()}</who>,	
<when>{<act>{$a/TITLE/text()}</act>, <scene>{$sc/TITLE/text()}</scene>}</when>}</speaks>
}
</result>



Q5
<result>{
for $a in document("j_caesar.xml")//PERSONAE, $b in $a/PGROUP/PERSONA where ($b/text()=$a/../ACT/SCENE/SPEECH/SPEAKER/text()) return <PERSONA>{$b/text()}</PERSONA>
}
</result>

Q7
<result>{
for $a in document("j_caesar.xml")//PERSONAE,$b in $a/PERSONA where not (($b/text() ="JULIUS CAESAR") or ($b/text() = "Another Poet")) return $b
}
</result>
