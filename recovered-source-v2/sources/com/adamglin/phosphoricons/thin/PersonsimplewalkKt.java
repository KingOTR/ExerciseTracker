package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplewalk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleWalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPersonSimpleWalk", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleWalk", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplewalkKt {
    private static ImageVector _personSimpleWalk;

    public static final ImageVector getPersonSimpleWalk(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _personSimpleWalk;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleWalk", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 76.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 152.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 28.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 144.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.curveToRelative(-33.65f, 0.0f, -49.92f, -16.43f, -64.28f, -30.93f);
        pathBuilder.curveToRelative(-3.52f, -3.57f, -6.86f, -6.93f, -10.34f, -10.0f);
        pathBuilder.curveToRelative(-0.66f, -0.57f, -1.34f, -1.09f, -2.0f, -1.59f);
        pathBuilder.lineToRelative(-16.86f, 38.77f);
        pathBuilder.lineToRelative(39.84f, 28.45f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 176.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(148.0f, 178.06f);
        pathBuilder.lineTo(111.23f, 151.8f);
        pathBuilder.lineTo(75.67f, 233.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.34f, -3.19f);
        pathBuilder.lineToRelative(55.93f, -128.62f);
        pathBuilder.curveToRelative(-29.7f, -10.55f, -73.0f, 29.64f, -73.52f, 30.09f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, true, 45.26f, 126.0f);
        pathBuilder.arcTo(173.4f, 173.4f, 0.0f, false, true, 78.1f, 102.59f);
        pathBuilder.curveToRelative(25.15f, -13.54f, 46.07f, -14.06f, 60.52f, -1.52f);
        pathBuilder.curveToRelative(3.71f, 3.23f, 7.15f, 6.7f, 10.79f, 10.37f);
        pathBuilder.curveToRelative(13.9f, 14.0f, 28.28f, 28.56f, 58.59f, 28.56f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleWalk = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
