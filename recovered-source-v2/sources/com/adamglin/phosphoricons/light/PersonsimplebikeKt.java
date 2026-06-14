package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplebike.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleBike", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleBike", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplebikeKt {
    private static ImageVector _personSimpleBike;

    public static final ImageVector getPersonSimpleBike(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleBike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleBike", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 78.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 38.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 138.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 200.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 202.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 200.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 138.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 56.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 202.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 56.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 118.0f);
        pathBuilder.lineTo(152.0f, 118.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -1.76f);
        pathBuilder.lineTo(120.0f, 88.49f);
        pathBuilder.lineTo(96.49f, 112.0f);
        pathBuilder.lineToRelative(35.75f, 35.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 152.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 154.49f);
        pathBuilder.lineTo(83.76f, 116.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f);
        pathBuilder.lineTo(154.49f, 106.0f);
        pathBuilder.lineTo(192.0f, 106.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleBike = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
